package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarDef {
	@Given("^The User is in the Delta Page$")
	public void the_User_is_in_the_Delta_Page() throws Throwable {
	    
	}

	@When("^The User Book a Car for \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_User_Book_a_Car_for(String PickupLoc, String From, String To, String PickupTime, String DropupTime, String Age) throws Throwable {
	    
	}

	@When("^The User Clicks on Book a Car button$")
	public void the_User_Clicks_on_Book_a_Car_button() throws Throwable {
	   
	}

	@Then("^The User Verifies the Title search Car Action$")
	public void the_User_Verifies_the_Title_search_Car_Action() throws Throwable {
	    
	}


}
