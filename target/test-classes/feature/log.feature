Feature: login functonality

  Scenario: login using valid credentials
    Given user is on login page
    When user enter the username and password
    And click on submit
    Then user navigate to home page
