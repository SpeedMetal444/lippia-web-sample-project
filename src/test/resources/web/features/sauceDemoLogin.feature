@SauceDemoLogin
Feature: As a potential client i need to log in in saucedemo to use the site

  Background: The client is on SauceDemo page

  @LoginSuccess
  Scenario: The client logs in correctly
    When The client use a correct user
    And  The client use a correct password
    And The client clics on the Login button
    Then The client verify that he logs in correctly

  @LoginFailure
  Scenario: The client fails to log in
    When The client use an incorrect user
    And The client use a correct password
    And The client clics on the Login button
    Then The client can read an error message
