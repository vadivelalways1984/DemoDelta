@tag
Feature: Verify flight status functionality

  @tag2
  Scenario Outline: Search flight search through number
    Given The user is in delta homepage
    When The user status a flight with "<Date>",and "<Number>"
    And The user clicks on view status button
    Then The user verifies the flight status through "<Number>"
   

    Examples: 
      | Date  |Number|
      | Today |2049  |
     
  Scenario Outline: Search flight search through source and destination
    Given The user is in delta homepage
    When The user status a fligh with "<From>" and "<To>"
    And The user clicks on view status button
    Then The user verifies the flight status through "<From>" "<To>" and "<Number">

    Examples: 
      | From | To  |Number|
      | ATL  | MSP |1886  |
     
