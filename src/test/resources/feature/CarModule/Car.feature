Feature: The User is in the Delta.com Page


Scenario Outline: Search result Functionality For CarBooking
Given The User is in the Delta Page
When The User Book a Car for "<PickUpLoc>"  "<From>" "<To>" "<PickupTime>" "<DropupTime>" "<Age>"
And The User Clicks on Book a Car button
Then The User Verifies the Title search Car Action

Examples:
|PickupLoc|From|To|PickupTime|DropupTime|Age|
|CHM|05/23/2018|05/24/2018|10.30 A.M|12.30 A.M|20|


