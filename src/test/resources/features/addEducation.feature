@regression
  Feature: Add Edication Tests

    @c_aducation @rerun
    Scenario: Check Add Education Form Labels
      Given The user is on the login page
      When The user logs in with using credentials "bilal@gmail.com" and "Bilal12345"
      Then The user should be able to login
      When The user navigation to "bilal" and "My Profile"
      When The user navigates to "Add Education"
      Then The user should be able to see following form labels
        | School or Bootcamp *    |
        | Degree or Certificate * |
        | Study                   |
        | From Date               |
        | To Date                 |
        | Program Description     |

      @c_addEducation
      Scenario Outline:
        Given The user is on the login page
        When The user logs in with using credentials "<email>" and "<password>"
        And The user navigation to "<accountName>" and "<menu>"
        And The user navigates to "<subMenu>"
        And The user fills the form with: "<school>","<degree>","<study>","<fromDate>","<toDate>" and "<description>"
        Then The user should be able to see last added education record with "<school>"
        Then The user should be able to delete last added record with "<school>"
        Examples:
          | email           | password   | accountName | menu       | subMenu       | school    | degree | study   | fromDate | toDate   | description  |
          | bilal@gmail.com | Bilal12345 | bilal       | My Profile | Add Education | hacettepe | second | finance | 11122012 | 12122016 | hard program |
          | mike@gmail.com | mike1234 | mike       | My Profile | Add Education | Bogazici | First | History | 11122012 | 12122016 | nice program |