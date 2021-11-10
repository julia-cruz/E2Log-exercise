package com.e2Parking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.e2Parking.utilities.Driver;

public class SelectParkingSpotPage {
	
	public SelectParkingSpotPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	 
	@FindBy (xpath = "//h5[contains(text(), 'Select a Parking Spot')]")
	public WebElement selectParkingSpotHeader;
	
	@FindBy (xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
	public WebElement selectSpotButton;
	


	
}
