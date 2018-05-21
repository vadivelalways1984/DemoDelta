package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.HomePage;
import com.ObjectRepository.VacationSearchResultPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VacationPackagesStarRatingsSteps extends FunctionalLibrary {
	List<Float> StarRating = new ArrayList<Float>();

	@Given("^The User clicks Vacation packages icon$")
	public void the_User_clicks_Vacation_packages_icon() throws Throwable {
		HomePage homePage = new HomePage();

		try {
			click(homePage.getBtnBannerClose());
		} catch (Exception e) {

		}

		click(homePage.getBtnVacationPackages());
	}

	@When("^The User inputs \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_User_inputs(String from, String to, String departureDate, String returnDate) throws Throwable {
		
		HomePage homePage = new HomePage();
		
		clearTextBox(homePage.getTxtFromAirportVacationPckg());
		homePage.getTxtFromAirportVacationPckg().sendKeys(from, Keys.DOWN, Keys.ENTER);
		homePage.getTxtToAirportVacationPckg().sendKeys(to, Keys.DOWN, Keys.ENTER);
		
		homePage.getTxtVacationDepartDate().sendKeys(departureDate, Keys.ESCAPE);
		homePage.getTxtVacationReturnDate().sendKeys(returnDate, Keys.ESCAPE);

	}

	@When("^The User clicks the Search Vacation Packages button$")
	public void the_User_clicks_the_Search_Vacation_Packages_button() throws Throwable {
		
		HomePage homePage = new HomePage();
		// click(homePage.getBtnVacationSubmit());
		homePage.getBtnVacationSubmit().click();
		homePage.getBtnVacationSubmit().click();


	}

	@Then("^The User sorts the result as per the star ratings of the hotels$")
	public void the_User_sorts_the_result_as_per_the_star_ratings_of_the_hotels() throws Throwable {
		VacationSearchResultPage vacationPage = new VacationSearchResultPage();
		//Thread.sleep(30000);
		waitForElementVisibility(vacationPage.getTxtHeader());
		click(vacationPage.getDrpdwnSortBy());
		click(vacationPage.getSelectOptionStarRating());
//		Thread.sleep(5000);

		String locatorRef = "//a[contains(@id,'ulRatings_$')]";

		for (int i = 0; i < 20; i++) {
			String replacement = String.valueOf(i);
			String locator = locatorRef.replace("$", replacement);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForElementVisibility(driver.findElement(By.xpath(locator)));
			jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(locator)));
			StringBuffer exactLocator = new StringBuffer(locator);
			exactLocator.append("/span");
			float total = 0.0f;
			float fullStar = 1.0f;
			float halfStar = 0.5f;
			for (int j = 1; j <= 6; j++) {

				String compare = driver.findElement(By.xpath(exactLocator + "[" + j + "]")).getAttribute("class");
				if (compare.equals("filled")) {
					total = total + fullStar;
				} else if (compare.equals("filled half")) {
					total = total + halfStar;
				}

			}
			StarRating.add(total);

		}

		System.out.println(StarRating);

	}

	@Then("^The User verifies the star ratings$")
	public void the_User_verifies_the_star_ratings() throws Throwable {
		int flag = 0;
		for (int i = 0; i < StarRating.size(); i++) {
			for (int j = i + 1; j < StarRating.size(); j++) {

				if (StarRating.get(i) < StarRating.get(j)) {
					flag = 1;
				}
			}

		}
		Assert.assertEquals(0, flag);

		System.out.println("The star ratings were in proper order");

	}

}
