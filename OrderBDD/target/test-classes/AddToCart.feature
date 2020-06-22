@Addtocart
Feature: Add to cart

  Scenario: Add an item to the cart
    Given The user is successfully logged in
    When User navigates on WOMEN menu
    And Clicks on "Printed Summer Dress"
    Then The detailed item page is opened
    When User clicks on + to increase the quantity
    And User clicks on blue color
    And User clicks on Add to cart button
    And User clicks on Proceed to checkout
    Then The item is successfully added to cart
