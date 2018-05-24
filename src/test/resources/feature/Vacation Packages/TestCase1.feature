Feature: Vacation package Functionality 

Scenario Outline:
Verify the sorted hotel list based on its star ratings in Vacation packages module 
	Given The user is in delta homepage 
	And The User clicks Vacation packages icon 
	When The User inputs "<From>","<To>","<DepartureDate>","<ReturnDate>" 
	And The User clicks the Search Vacation Packages button 
	Then The User sorts the result as per the star ratings of the hotels 
	And The User verifies the star ratings 
	
	Examples: 
		|From|To|DepartureDate|ReturnDate|
		|JFK|DFW|05/25/2018|05/30/2018|
