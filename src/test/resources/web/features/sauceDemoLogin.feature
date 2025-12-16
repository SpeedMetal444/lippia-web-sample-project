@SauceDemoLogin @SauceDemo
Feature: Log in to the SauceDemo page
  As a potential client
  I want to log in in SauceDemo
  So that I can use the site

  Background:
    Given The user is on SauceDemo page

  @LoginSuccess
  Scenario: The user logs in correctly
    When The user use a correct user
    And  The user use a correct password
    And The user clicks on the Login button
    Then The user verify that he logs in correctly

  @LoginFailure
  Scenario: The user fails to log in
    When The user use an incorrect user
    And The user use a correct password
    And The user clicks on the Login button
    Then The user can read an error message
