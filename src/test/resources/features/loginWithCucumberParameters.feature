Feature: Login Tests with cucumber parameters

  Background:
    Given The user on the login page

  @wip
  Scenario: Login as bilal - Cucumber Parameters
#    Given The user on the login page
    When The user logs in with using creadentials "bilal@gmail.com" and "Bilal12345"
    Then The user should be able to login
    And Verify taht username "bilal" is displayed on dashboard page

  @wip
  Scenario: Login as mike -Cucumber Parameters
#    Given The user on the login page
    When The user logs in with using creadentials "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And Verify taht username "mike" is displayed on dashboard page

  @wip
  Scenario: Login as Rosa -Cucumber Parameters
#    Given The user on the login page
    When The user logs in with using creadentials "rosa@test.com" and "Test123456"
    Then The user should be able to login
    And Verify taht username "Rosa" is displayed on dashboard page