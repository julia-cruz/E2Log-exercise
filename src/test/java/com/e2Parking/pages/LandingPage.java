package com.e2Parking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.e2Parking.utilities.Driver;



public class LandingPage{

	public LandingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	 
	
	
	@FindBy (css = "div>button[class*='btn btn-primary btn-lg']")
	public WebElement reserveASpotButton;
	

	
}

