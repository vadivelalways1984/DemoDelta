Feature: Advanced Flight Search Functionality Verification 

Scenario Outline: Advanced Flight Search functionality for One-way 
	Given User is in Delta website 
	And User clicks Advanced Search button 
	When User clicks one-way button in advanced search page and inputs "<from>","<to>","<date>" 
	And User selects Main cabin V or higher as the class and clicks Find flights button 
	Then User verifies Search result page header
	Examples:
	|from|to|date|
	|DAL|NYC|31-05-2018| 
	
	