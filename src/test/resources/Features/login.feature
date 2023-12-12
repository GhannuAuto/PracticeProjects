Feature: feature to test login functionality
  Scenario: Check login is successful with valid credentials
    Given User is no login page
    When User enters username and password
    Then Click on Login button
    And User is navigated to Home Page of the application