@regression
Feature: Login Tests with cucumber parameters

  Background:
    Given The user is on the login page

  @rerun
  Scenario: Login as bilal - Cucumber Parameters
#    Given The user on the login page
    When The user logs in with using credentials "bilal@gmail.com" and "Bilal12345"
    Then The user should be able to login
    And Verify that username "bilal" is displayed on dashboard page

  @number
  Scenario: Login as mike -Cucumber Parameters
#    Given The user on the login page
    When The user logs in with using credentials "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And Verify that username "mike" is displayed on dashboard page
    And The number is 5
    And The number also is 2.5
    And The number can be 2.8

@c_maven_2
  Scenario: Login as Rosa -Cucumber Parameters
#    Given The user on the login page
    When The user logs in with using credentials "rosa@test.com" and "Test123456"
    Then The user should be able to login
    And Verify that username "Rosa" is displayed on dashboard page


  Scenario Outline: Login with different names
#      Given The user is on the login page
    When The user logs in with using credentials "<userEmail>" and "<password>"
    Then The user should be able to login
    And Verify that username "<name>" is displayed on dashboard page
    Examples:
      | userEmail       | password   | name  |
      | rosa@test.com   | Test123456 | Rosa  |
      | mike@gmail.com  | mike1234   | mike  |
      | bilal@gmail.com | Bilal12345 | bilal |

    @c_maven
  Scenario: Login with list
    When The user logins with following credentials
      | bilal@gmail.com |
      | Bilal12345      |
    Then The user should be able to login

   @rerun
  Scenario Outline: Login with list DDF
    When The user logins with following credentials
      | <userEmail> |
      | <password>  |
    Then The user should be able to login
    Examples:
      | userEmail       | password   |
      | rosa@test.com   | Test123456 |
      | mike@gmail.com  | mike1234   |
      | bilal@gmail.com | Bilal12345 |