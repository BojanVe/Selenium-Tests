@Login
Feature: Log In
	
	Scenario: Log in with valid credentials
	Given Browser is started and the page is loaded
	When I click on log in link
	And I enter valid username
	And I enter valid password
	And I click on log in button
	Then I am successfully logged in