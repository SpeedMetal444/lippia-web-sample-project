@SauceDemoLogin
Feature: Log in to the SauceDemo page
  As a potential client
  I want to log in in SauceDemo
  To use the site

  Background:
    Given The client is on SauceDemo page

  @LoginSuccess
  Scenario: The client logs in correctly
    When The client use a correct user
    And  The client use a correct password
    And The client clicks on the Login button
    Then The client verify that he logs in correctly

  @LoginFailure
  Scenario: The client fails to log in
    When The client use an incorrect user
    And The client use a correct password
    And The client clicks on the Login button
    Then The client can read an error message
