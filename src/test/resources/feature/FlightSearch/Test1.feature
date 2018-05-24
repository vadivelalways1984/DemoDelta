@tag
Feature: Verify flight search functionality

  @tag2
  Scenario Outline: Search result functionality for roundtrip
    Given The user is in delta homepage
    When The user searches a flight for roundtrip for "<From>", "<To>" , "<Date>" and "<paxCount>"
    And The user clicks on findflight button
    Then The user verifies flight search page

    Examples: 
      | From | To  | Date      | paxCount |
      | ATL  | MSP | 5/18/2018 | 4		  |
