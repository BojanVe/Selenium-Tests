Feature: Wishlist functionality
	
	Scenario: Complete filter test
	Given I am logged in
	When I navigate to DRESSES tab
	And Hover on item
	And I add the item to Wishlist
	Then The item is successfully added to Wishlist
	When I click on an item
	And The item detailed page is opened
	And I click on Add to Wishlist button
	Then Another item is successfully added to wishlist
	When I click on my account button
	And Navigate to My Wishlists
	And Click on my wishlist name
	And Click on delete icon on one of the items
	Then That item will be deleted from my wishlist
	
	
	