#Author: Karthicka
@tag
Feature: Verify vacation packages functionality test

  @tag2
  Scenario Outline: Search result functionality for Flight and Hotel
    Given The user is in delta.com homepage
    When The user searches a flight for roundtrip for "<From>", "<To>" , "<Depaturedate >" ,"<ReturnDate>" and "<Adults>"
    And The user selects the search vacation packages
    Then The user verifies the advanced results  title of the page
    And The user should see the search results page
   
       Examples: 
      | From | To  | Depaturedate |ReturnDate|Adults|
      | ATL  | MSP | 5/20/2018 | 5/23/2018|2|
      
      
 
 