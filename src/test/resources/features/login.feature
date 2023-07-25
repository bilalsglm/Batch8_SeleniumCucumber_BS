Feature: Login Functionality
  # user story = feature
  # test case = scenario
  # test steps = Given, When, Then etc..

#  Background:
#    Given The user on the login page

  Scenario: Login as bilal
    Given The user on the login page
    When The user enters bilal`s creadentials
    Then The user should be able to login

  Scenario: Login as mike
    Given The user on the login page
    When The user enters mike`s creadentials
    Then The user should be able to login

    # class task :
  # new scenario : Login as Rosa

  Scenario: Login as Rosa
    Given The user on the login page
    When The user enters Rosa`s creadentials
    Then The user should be able to login

  Scenario: Login as Mansimmo
    Given The user on the login page
    When The user enters Mansimmo`s email
    And The user enter Mansimmo`s password
    And The user clicks on login button
    Then The user should be able to login
    And The user should be able to see own username