#Author: Teena creating SimpleHotelSearch
@tag
Feature: Verify Hotel search functionality

	@tag2
	Scenario Outline: Search result functionality for Hotel for single room
	Given The user is in delta homepage
	And The user selects the Hotel tab
	When The user searches a hotel providing "<Addesss>","<Check-in>","<Check-out>","<Rooms>","<Adults>" and "<Children>"
	And The user click on book_a_hotel button
	Then The user verifies the hotel serach result
	And The user should see the search result page
	
	Examples:
	|Addesss|Check-in|Check-out|Rooms|Adults|Children|
	|Landon	|05/25/2018|05/31/2018|1|1|-|
	