Feature: Footer functionality
	
	Scenario: Testing Footer functionality and informations
	Given I am on home page and footer is successfully loaded
	When I click on Women
	Then Women category is displayed
	When I click on Specials
	Then Products with discounts are loaded
	When I click on Contact Us
	Then Contact page is loaded
	When I click My Orders
	Then My order history is displayed
	When I click on Email link
	Then Email app is opened
	When I enter my email to newsletter
	And I click on proceed button
	Then I am successfully signed for newsletter
	When I click on facebook icon
	Then Facebook page is loaded in a new tab
	
	