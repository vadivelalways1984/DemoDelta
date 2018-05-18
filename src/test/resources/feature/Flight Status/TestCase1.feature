@tag
Feature: Verify flight status functionality

  @tag2
  Scenario Outline: Search flight search through number
    Given The user is in delta homepage
    When The user searches a flight status"<Date>",and "<Number>"
    And The user clicks on view status button
    Then The user verifies the flight search results title
   

    Examples: 
      | Date      |Number|
      | 5/18/2018 |2049  |

  Scenario Outline: Search flight search through source and destination
    Given The user is in delta homepage
    When The user searches a fligh status "<From>" and "<To>"
    And The user clicks on view status button
    Then The user verifies the flight search results title

    Examples: 
      | From | To  |
      | ATL  | MSP |
     
