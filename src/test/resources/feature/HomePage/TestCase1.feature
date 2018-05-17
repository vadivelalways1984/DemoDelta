#Author: Greens
@tag
Feature: Verify flight search functionality

  @tag2
  Scenario Outline: Search result functionality for oneway
    Given The user is in delta homepage
    When The user searches a flight for oneway for "<From>", "<To>" and "<Date>"
    And The user clicks on findflight button
    Then The user verifies the flight search results title
    And The user should see the search results page

    Examples: 
      | From | To  | Date      |
      | ATL  | MSP | 5/18/2018 |

  Scenario Outline: Search result functionality for oneway with more than one passenger
    Given The user is in delta homepage
    When The user searches a flight for oneway for "<From>", "<To>" and "<Date>"
    And The user selects the number of passengers as "<paxCount>"
    And The user clicks on findflight button
    Then The user verifies the flight search results title

    Examples: 
      | From | To  | Date      | paxCount |
      | ATL  | MSP | 5/18/2018 |        4 |
      | ATL  | MSP | 5/18/2018 |        9 |
