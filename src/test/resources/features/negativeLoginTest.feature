@regression
Feature: Negative Login Test

  @negativeLogin
  Scenario Outline: negative login test
    Given The user is on the login page
    When The user logs in with using credentials "<invalidUserEmail>" and "<invalidPassword>"
    Then Verify that warning message is "<message>"
    Examples:
      | invalidUserEmail | invalidPassword | message                                  |
      | invalidUserEmail | Bilal12345      | Email address is incorrect. Please check |
      | bilal@gmail.com  | invalidPassword | Password is incorrect. Please check      |
      |                  | Bilal12345      | Please enter your email.                 |
      | invalidUserEmail |                 | Please enter your password!              |
      |                  |                 | Please enter your email.                 |
