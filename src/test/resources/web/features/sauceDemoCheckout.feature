@SauceDemoCheckout @SauceDemo
Feature: Complete Purchase and Validate Checkout Data
  As a SauceDemo customer
  I want to add two different products to the cart and complete the checkout process
  So that I can verify that the correct products and prices are displayed before finishing the purchase

  Background:
    Given The user logs in to SauceDemo

  @OrderSuccess @Smoke @Regression
  Scenario: Successful checkout with product and price validation
    When The user adds two products to the cart
    And The user completes the checkout form with name 'Abel', last name 'Godoy' and zip code '3400'
    And The user verifies that the product names and prices are correct in the overview page
    Then The user finishes the checkout successfully

  @OrderFailureEmptyName @Regression
  Scenario: Order failure caused by empty name space
    When The user adds two products to the cart
    And The user completes the checkout form with name '', last name 'Godoy' and zip code '3400'
    Then The user can read the 'Error: First Name is required' message

  @OrderFailureEmptyZipCode @Regression
  Scenario: Order failure caused by empty name space
    When The user adds two products to the cart
    And The user completes the checkout form with name 'Abel', last name 'Godoy' and zip code ''
    Then The user can read the 'Error: Postal Code is required' message
