@regression
Feature: Dashboard Menu Checks

  Background:
    Given The user is on the login page
  @c_List
  Scenario: Example-1 for Cucumber List
    #Given The user is on the login page
    When The user logs in with using credentials "bilal@gmail.com" and "Bilal12345"
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | bilal      |

  @c_Map
  Scenario: Example-2 Map for Cucumber
    #Given The user is on the login page
    When The user logs in following menu
      | usermail | bilal@gmail.com |
      | password | Bilal12345      |
      | name     | bilal           |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | bilal      |


  @c_ScenarioOutline
    Scenario Outline:Example-2 Map for Cucumber
      #Given The user is on the login page
      When The user logs in following menu
        | usermail | <userEmail> |
        | password | <password>  |
      Then The user should be able to login
      And The user should be able to see following menu
        | Dashboard  |
        | Developers |
        | Components |
        | Forms      |
        | JavaScript |
        | <name>      |
      Examples:
        | userEmail       | password   | name  |
        | rosa@test.com   | Test123456 | Rosa  |
        | mike@gmail.com  | mike1234   | mike  |
        | bilal@gmail.com | Bilal12345 | bilal |

    #Class Task
  #go to web page
  #login with user credentials
  #navigate to my profile menu
  #see the following menus Overview, Edit Profile, Add Experience, Add Education, Change Password

  @c_Task
  Scenario: Example-3 for Task
    #Given The user is on the login page
    When The user logs in with using credentials "bilal@gmail.com" and "Bilal12345"
    And The user navigation to "bilal" and "My Profile"
    Then The user should be able to see following subMenu
      | Overview        |
      | Edit Profile    |
      | Add Experience  |
      | Add Education   |
      | Change Password |
