Feature: GS using examples

  Scenario Outline: Google Search
    Given user is on Google page
    When user enter <texttosearch> in searchBox
    And click on Search button
    Then user Navigate to results page
    And user print all the hyperlinks

    Examples: 
      | texttosearch |
      | IBM          |
      | WIPRO        |
      | Infosys      |
      | Oracle       |
      | CapGemini    |