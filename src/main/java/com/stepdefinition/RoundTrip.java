package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoundTrip {

	@Given("^The user is in the delta homepage$")
	public void the_user_is_in_the_delta_homepage() throws Throwable {
	   
	}

	@When("^The user searches a flight for roundtrip for \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_searches_a_flight_for_roundtrip_for_and(String from, String to, String date) throws Throwable {
	 
	}

	@Then("^The user verifies the flight results title of the page$")
	public void the_user_verifies_the_flight_results_title_of_the_page() throws Throwable {
		
	}

}
