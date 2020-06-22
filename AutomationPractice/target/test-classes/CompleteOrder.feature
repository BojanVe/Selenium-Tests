Feature: Order Flow

  Scenario: Complete order flow
    Given I am logged in and an item is added to the cart
    When I click on my shopping cart
    Then I proceed to checkout
    When I choose my addresses
    And Add a comment
    And Proceed to shipping step
    And I agree to the terms of service
    And I select payment method
    And I confirm my order
    Then My order on My store is complete
