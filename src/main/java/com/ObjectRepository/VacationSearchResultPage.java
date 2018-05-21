package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class VacationSearchResultPage extends FunctionalLibrary{
	public VacationSearchResultPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@id='stateProv-button']//child::span[1]")
	private WebElement drpdwnSortBy;
	
	
	
	@FindBy(xpath="//*[@id='ui-id-7' and text()='Star Rating']")
	private WebElement selectOptionStarRating;
	
	
	@FindBy(xpath="//a[contains(@id,'ulRatings_')]/span[@class='aria-offscreen']")
	private List<WebElement> elementsStarRating;
	
	@FindBy(xpath="//h1")
	private WebElement txtHeader;


	public WebElement getDrpdwnSortBy() {
		return drpdwnSortBy;
	}


	public WebElement getSelectOptionStarRating() {
		return selectOptionStarRating;
	}


	public List<WebElement> getElementsStarRating() {
		return elementsStarRating;
		
		
	}


	public WebElement getTxtHeader() {
		return txtHeader;
	}
	
	

}
