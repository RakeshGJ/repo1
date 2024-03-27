#Author: Rakesh
Feature: print all the autosuggestion on google

  Scenario: print the autosuggestion of IBM
    Given user launch the browser
    And user pass the url
    When user type ibm on search field
    And user get all autosuggestions
    Then print all autosuggestions
