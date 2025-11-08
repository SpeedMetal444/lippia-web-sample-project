@SauceDemoCheckout
Feature: Complete Purchase and Validate Checkout Data
  As a SauceDemo customer
  I want to add two different products to the cart and complete the checkout process
  So that I can verify that the correct products and prices are displayed before finishing the purchase

  @LoginAddVerifyAndFinish
  Scenario: Successful checkout with product and price validation
    Given The user logs in to SauceDemo
    When The user adds two products to the cart
    And The user proceeds through the checkout steps
    Then The user verifies that the product names and prices are correct in the overview page
    And The user finishes the checkout successfully
