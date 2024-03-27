#Author: Rakesh
#Description: Create multiplecustomer in actitime application
Feature: create multiplecustomer

  Scenario Outline: create customer with customername and description
    Given user is on acttitime loginpage
    When login with  validcredentials
    And click  on login button
    Then user  click on task
    And user click on addnew button
    And user click on newcustomer
    Then user enter  <customername> and <customerdesc>
    And click on createcustomer
    Then user get a successs message

    Examples: 
      | customername | customerdesc |
      | customer2    | csd1         |
