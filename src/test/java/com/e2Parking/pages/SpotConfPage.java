package com.e2Parking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.e2Parking.utilities.Driver;

public class SpotConfPage {
	
	
	public SpotConfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
		@FindBy (xpath = "//button[@class='d-none d-md-block ant-btn ant-btn-primary ant-btn-round ng-star-inserted']")
		public WebElement ReviewReservationButton;
	

}
