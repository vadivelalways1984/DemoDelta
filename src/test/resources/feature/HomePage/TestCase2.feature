#Author: Test
@tag
Feature: Verify flight search functionality test

  @tag2
  Scenario Outline: Search result functionality for oneway
    Given The user is in the delta homepage
    When The user searches a flight for roundtrip for "<From>", "<To>" and "<Date>"
    Then The user verifies the flight results title of the page
   
       Examples: 
      | From | To  | Date      |
      | ATL  | MSP | 5/18/2018 |