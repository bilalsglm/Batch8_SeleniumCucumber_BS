Feature: Login test with excel file

  Scenario Outline: Login Test-1
    Given The user is on the login page
    When The user logins with using excel file:"<path>","<sheetName>" and <rowNumber>
    Then The user should be able to login
    Examples:
      | path                              | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 1         |
      | src/test/resources/LoginList.xlsx | QaTeam2   | 3         |
      | src/test/resources/LoginList.xlsx | QaTeam3   | 0         |
      | src/test/resources/LoginList.xlsx | QaTeam4   | 5         |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 4         |

  @wip
  Scenario Outline: Login Test-2
    Given The user is on the login page
    When The user logins with "Your Email" and "Password" using excel file:"<path>","<sheetName>" and <rowNumber>
    Then The user should be able to login
    And The user verifies success login with "Your Name" using excel file:"<path>","<sheetName>" and <rowNumber>
    Examples:
      | path                              | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 2         |
      | src/test/resources/LoginList.xlsx | QaTeam2   | 4         |
      | src/test/resources/LoginList.xlsx | QaTeam3   | 1         |
      | src/test/resources/LoginList.xlsx | QaTeam4   | 2         |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 3         |


