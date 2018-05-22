package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class ClassSe extends FunctionalLibrary {
	
	public ClassSe() {
		PageFactory.initElements(driver, this);
	}

@FindBy (id= "book-car-content-trigger")	
private WebElement btnHCarClick;
	
@FindBy(id ="pickUpWidgetDate")
private WebElement txtPickupD;

@FindBy(id = "pickUpTime-button")
private WebElement txtPickT;

@FindBy(id = "dropOffTime-button")
private WebElement txtDropT;

@FindBy(id = "ageWidget-button")
private WebElement txtAgeB;


public WebElement getBtnHCarClick() {
	return btnHCarClick;
}

public WebElement getTxtPickupD() {
	return txtPickupD;
}

public WebElement getTxtPickT() {
	return txtPickT;
}

public WebElement getTxtDropT() {
	return txtDropT;
}

public WebElement getTxtAgeB() {
	return txtAgeB;
}






}



