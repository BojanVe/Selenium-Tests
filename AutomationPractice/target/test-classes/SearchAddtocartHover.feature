Feature: Add to cart

  Scenario: Add an item to the cart via search and hover function
    Given I am successfully logged in
    When I enter "Blue" in the search bar
    And I Point to "Faded Short Sleeve T-shirts"
    And I click on Add to Cart button
    Then The item is successfully added to cart
