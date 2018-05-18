#Author: Parasakthi
@tag
Feature: Verify flight search functionality

  @tag2
  Scenario Outline: Search result functionality for multicity advanced
    Given The user is in delta homepage
    And The user click on multi city button
    When The user search flight for multicity flight1 "<From>" , "<To>" , "<Date>" , "<connection>"
    And The user search flight for multicity flight2 "<From>" , "<To>" , "<Date>" , "<connection>" and  "<paxCount>"
    And The user clicks on findflights button
    Then The user verifies the book a flight title
    And The user should see the find search result page
    
 Examples: 
      | From | To  | Date      |Connection| From | To  | Date      |Connection|paxCount|
      | ATL  | MSP | 5/27/2018 |   JNU     |MSP   |ATL  |5/29/2018 |     XNA  |   2    |

