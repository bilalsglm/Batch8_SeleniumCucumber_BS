@regression
Feature: Login Functionality
  # user story = feature
  # test case = scenario
  # test steps = Given, When, Then etc..

#  Background:
#    Given The user on the login page

  @bilal  @Login
  Scenario: Login as bilal
    Given The user on the login page
    When The user enters bilal`s creadentials
    Then The user should be able to login

  @mike  @Login @dataBase
  Scenario: Login as mike
    Given The user on the login page
    When The user enters mike`s creadentials
    Then The user should be able to login

    # class task :
  # new scenario : Login as Rosa

  @Rosa  @Login @smoke
  Scenario: Login as Rosa
    Given The user on the login page
    When The user enters Rosa`s creadentials
    Then The user should be able to login

  @Mansimmo
  Scenario: Login as Mansimmo
    Given The user on the login page
    When The user enters Mansimmo`s email
    And The user enter Mansimmo`s password
    And The user clicks on login button
    Then The user should be able to login
    And The user should be able to see own username

  @John  @smoke  @Login
  Scenario: Login as John
    Given The user on the login page
    When The user enters John`s creadentials
    Then The user should be able to login