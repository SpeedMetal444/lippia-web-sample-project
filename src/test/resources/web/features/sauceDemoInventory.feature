@SauceDemoInventory @SauceDemo
Feature: Manage items in the cart from the inventory page
  As a client on SauceDemo
  I want to add and remove products from the cart
  So that I can verify the cart badge updates correctly

  @CartBadgeCountVerify
  Scenario: Add and remove the first item from the cart and verify badge updates
    Given The client is logged in and on the inventory page
    When The client adds the first product Sauce Labs Backpack to the cart
    Then The cart badge should show 1
    When The client removes the same product from the cart
    Then The cart badge should be 0 or not visible
