#Author: Parasakthi
@tag
Feature: Verify flight search functionality

  @tag2
  Scenario Outline: Search result functionality for multicity advanced
    Given The user is in delta homepage
    And The user click on multi city button
    When The user search flight for multicity flight1 "<Flight1From>" , "<Flight1To>" , "<Flight1Date>" , "<Flight1Connection>"
    And The user search flight for multicity flight2 "<Flight2From>" , "<Flight2To>" , "<Flight2Date>" , "<Flight2Connection>" and  "<paxCount>"
    And The user clicks on findflights button
    Then The user verifies the book a flight title
    And The user should see the find search result page
    
 Examples: 
      | Flight1From | Flight1To | Flight1Date | Flight1Connection | Flight2From | Flight2To | Flight2Date | Flight2Connection | paxCount |
      |     ATL     |     MSP   |  5/27/2018  |         JNU       |       MSP   |    ATL    |  5/29/2018  |         XNA       |     2    |

