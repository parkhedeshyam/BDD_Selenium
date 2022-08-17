Feature: Gmail login application

  Scenario: To check login functionality
    Given User is on gmail login page
    When User enter the username and password
    And User clicks on the login button
    Then User is on gmail home page
