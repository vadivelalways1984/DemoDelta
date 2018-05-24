@tag
Feature: Verify flight search functionality

  @tag2
  Scenario Outline: Search result functionality for roundtrip
    Given The user is in delta homepage
    When The user searches a flight for roundtrip for "<From>", "<To>" , "<DepDate>" , "<RetDate>" and "<Passengers>"
    And The user clicks on findflight button
    Then The user verifies flight search page

    Examples: 
      | From | To  | DepDate	|RetDate	|Passengers|
      | ATL  | MSP | 05/25/2018	|06/02/2018	|	2	   |
