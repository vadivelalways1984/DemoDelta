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
	
	@FindBy(name = "returnDate")
	private WebElement txtReturnDate;

	@FindBy(name = "findFlightsSubmit")
	private WebElement btnFlightSubmit;

	@FindBy(id = "paxCount-button")
	private WebElement btn_paxCount;

	@FindBy(xpath = "//ul[@id='paxCount-menu']//li[contains(text(),'$')]")
	private WebElement drpdwn_paxCountMenu;

	@FindBy(xpath = "//h1[text()='BOOK A TRIP']")
	private WebElement headersearchResult;
	
	@FindBy(id="book-delta-vacations-content-trigger")
	private WebElement btnVacationPackages;
	
	@FindBy(id="fromAirport")
	private WebElement txtFromAirportVacationPckg;
	
	@FindBy(id="toAirport")
	private WebElement txtToAirportVacationPckg;
	
	@FindBy(id="vacationsdepartureDate")
	private WebElement txtVacationDepartDate;
	
	
	@FindBy(id="vacationsreturnDate")
	private WebElement txtVacationReturnDate;
	
	@FindBy(id="vacationsSubmit")
	private WebElement btnVacationSubmit;
	
	
	@FindBy(id="ck-banner-close")
	private WebElement btnBannerClose;
	
	

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
	

	public WebElement getTxtReturnDate() {
		return txtReturnDate;
	}

	public WebElement getBtn_paxCount() {
		return btn_paxCount;
	}

	public WebElement getDrpdwn_paxCountMenu() {
		return drpdwn_paxCountMenu;
	}

	public WebElement getHeadersearchResult() {
		return headersearchResult;
	}

	public WebElement getBtnVacationPackages() {
		return btnVacationPackages;
	}

	public WebElement getTxtFromAirportVacationPckg() {
		return txtFromAirportVacationPckg;
	}

	public WebElement getTxtToAirportVacationPckg() {
		return txtToAirportVacationPckg;
	}

	public WebElement getBtnVacationSubmit() {
		return btnVacationSubmit;
	}
	

	public WebElement getTxtVacationDepartDate() {
		return txtVacationDepartDate;
	}

	public WebElement getTxtVacationReturnDate() {
		return txtVacationReturnDate;
	}

	public WebElement getBtnBannerClose() {
		return btnBannerClose;
	}

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

}
