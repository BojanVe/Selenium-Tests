Feature: Add to cart

  Scenario: Add 3 pieces of blue Printed Summer Dress
    Given I am successfully logged in and I am on my account page
    When I click on WOMEN tab
    And I click on Printed Summer Dress
    Then The detailed item page is opened
    When I select blue color
    And Increase the quantity to 3 pieces
    And Select size M
    And Click Add to cart
    Then The items are successfully added to the cart
 
