@regression
Feature: Login Functionality
  # user story = feature
  # test case = scenario
  # test steps = Given, When, Then etc..

#  Background:
#    Given The user on the login page

  @bilal  @Login
  Scenario: Login as bilal
    Given The user is on the login page
    When The user enters bilal`s credentials
    Then The user should be able to login

  @mike  @Login @dataBase
  Scenario: Login as mike
    Given The user is on the login page
    When The user enters mike`s credentials
    Then The user should be able to login

    # class task :
  # new scenario : Login as Rosa

  @Rosa  @Login @smoke
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa`s credentials
    Then The user should be able to login


  @John  @smoke  @Login
  Scenario: Login as John
    Given The user is on the login page
    When The user enters John`s credentials
    Then The user should be able to login