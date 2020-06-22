Feature: Log in functionality

  Scenario: Log in with valid credentials
    Given I am on home page
    When I click on Sign In button
    And I enter "bojan.velevski@yahoo.com" in email
    And I enter "testing123" in password
    Then I am successfully signed
    Then I click Log Out button
    And I am logged out
    And The browser can be closed
