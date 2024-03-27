@production1
Feature: Google Search

  Background: 
    Given user is on Google page

  @s12
  Scenario: Search for DigiSoft
    When user enter "DigiSoft" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user save all the hyperlinks

  @s123
  Scenario: Search for DigiSoft
    When user enter "DigiSoft" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user fail the test

  @s2
  Scenario: Search for IBM
    When user enter "IBM" in searchBox
    And click on Search button
    Then user Navigate to result page
    And user print all the hyperlinks

  @s1 @s2
  Scenario: Search for WIPRO
    When user enter "WIPRO" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

  @s3
  Scenario: Search for Oracle
    When user enter "Oracle" in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

  @s1 @s3
  Scenario: Search for Squareroot
    When user enter 25 in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

  @s1 @s2 @s3
  Scenario: Search for Squareroot
    When user enter 25.5 in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks