package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {

	@Given("^The user is in delta homepage$")
	public void the_user_is_in_delta_homepage() throws Throwable {
		driver.get("https://www.delta.com/");
	}

	@When("^The user searches a flight for oneway for \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_searches_a_flight_for_oneway_for_and(String from, String to, String date) throws Throwable {
		HomePage homepage = new HomePage();
		click(homepage.getBtnOneWay());
		homepage.getTxtOriginCity().clear();
		setText(homepage.getTxtOriginCity(), from);
		homepage.getTxtOriginCity().sendKeys(Keys.ENTER);
		homepage.getTxtdestinationCity().clear();
		setText(homepage.getTxtdestinationCity(), to);
		homepage.getTxtdestinationCity().sendKeys(Keys.ENTER);
		setText(homepage.getTxtdepartureDate(), date);
		click(homepage.getBtnFlightSubmit());
	}

	@Then("^The user verifies the flight search results title$")
	public void the_user_verifies_the_flight_search_results_title() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Flight Results"));
	}

}