package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {

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
	}

	@When("^The user clicks on findflight button$")
	public void the_user_clicks_on_findflight_button() throws Throwable {

		HomePage homepage = new HomePage();
		click(homepage.getBtnFlightSubmit());
	}

	@Then("^The user verifies the flight search results title$")
	public void the_user_verifies_the_flight_search_results_title() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Flight Results"));
	}

	@Then("^The user should see the search results page$")
	public void the_user_should_see_the_search_results_page() throws Throwable {
		HomePage homepage = new HomePage();
		waitForElementVisibility(homepage.getheaderSearchResult());
		Assert.assertTrue(driver.getCurrentUrl().contains("search-results"));
	}

	@When("^The user selects the number of passengers as \"([^\"]*)\"$")
	public void the_user_selects_the_number_of_passengers_as(String paxCount) throws Throwable {
		HomePage homepage = new HomePage();
		click(homepage.getbtnPaxCount());
		String locator = "//ul[@id='paxCount-menu']//li[contains(text(),'$')]";
		locator = locator.replace("$", paxCount);
		click(driver.findElement(By.xpath(locator)));

	}
}