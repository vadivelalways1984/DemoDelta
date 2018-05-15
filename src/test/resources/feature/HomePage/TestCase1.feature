#Author: Greens
@tag
Feature: Verify flight search functionality

  @tag2
  Scenario Outline: Search result functionality for oneway
    Given The user is in delta homepage
    When The user searches a flight for oneway for "<From>", "<To>" and "<Date>"
    Then The user verifies the flight search results title

    Examples: 
      | From | To  | Date      |
      | ATL  | MSP | 5/18/2018 |
