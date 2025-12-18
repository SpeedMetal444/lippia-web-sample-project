@SauceDemoInventory @SauceDemo
Feature: Manage items in the cart from the inventory page
  As a client on SauceDemo
  I want to add and remove products from the cart
  So that I can verify the cart badge updates correctly

  @AddAProduct @Smoke @Regression @TPFinal
  Scenario: Add an item to cart and then verify the cart badge
    Given The user is logged in and on the inventory page
    When The user adds the product Sauce Labs Bolt T-Shirt to the cart
    Then The cart badge should show 1

  @RemoveAProduct @Regression @TPFinal
  Scenario: Remove an item from the cart and then verify the cart badge
    Given The user is logged in and on the inventory page
    And The user adds the product Sauce Labs Bolt T-Shirt to the cart
    When The user removes the Sauce Labs Bolt T-Shirt from the cart
    Then The cart badge should be 0 or not visible

  @CartBadgeCountVerify @Regression
  Scenario: Add and remove the first item from the cart and verify badge updates
    Given The user is logged in and on the inventory page
    When The user adds the product Sauce Labs Backpack to the cart
    And The cart badge should show 1
    And The user removes the Sauce Labs Backpack from the cart
    Then The cart badge should be 0 or not visible
