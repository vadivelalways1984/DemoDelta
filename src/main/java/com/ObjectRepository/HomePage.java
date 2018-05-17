package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {

	@FindBy(id = "oneWayBtn")
	private WebElement btnOneWay;

	@FindBy(id = "roundTripBtn")
	private WebElement btnroundTrip;

	@FindBy(id = "air-shopping-multicity-link")
	private WebElement lnkMultiCity;

	@FindBy(id = "originCity")
	private WebElement txtOriginCity;

	@FindBy(name = "destinationCity")
	private WebElement txtdestinationCity;

	@FindBy(name = "departureDate")
	private WebElement txtdepartureDate;

	@FindBy(name = "findFlightsSubmit")
	private WebElement btnFlightSubmit;

	@FindBy(id = "paxCount-button")
	private WebElement btn_paxCount;

	@FindBy(xpath = "//ul[@id='paxCount-menu']//li[contains(text(),'$')]")
	private WebElement drpdwn_paxCountMenu;

	@FindBy(xpath = "//h1[text()='BOOK A TRIP']")
	private WebElement headersearchResult;

	public WebElement getheaderSearchResult() {
		return headersearchResult;
	}

	public WebElement getbtnPaxCount() {
		return btn_paxCount;
	}

	public WebElement getdrpdwnPaxCountMenu() {
		return drpdwn_paxCountMenu;
	}

	public WebElement getBtnOneWay() {
		return btnOneWay;
	}

	public WebElement getBtnroundTrip() {
		return btnroundTrip;
	}

	public WebElement getLnkMultiCity() {
		return lnkMultiCity;
	}

	public WebElement getTxtOriginCity() {
		return txtOriginCity;
	}

	public WebElement getTxtdestinationCity() {
		return txtdestinationCity;
	}

	public WebElement getTxtdepartureDate() {
		return txtdepartureDate;
	}

	public WebElement getBtnFlightSubmit() {
		return btnFlightSubmit;
	}

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

}
