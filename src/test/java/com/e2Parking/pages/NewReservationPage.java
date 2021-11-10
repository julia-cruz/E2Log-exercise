package com.e2Parking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.e2Parking.utilities.Driver;

public class NewReservationPage {

	public NewReservationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	    @FindBy (xpath = "//h4[@class='page-title']")
	    public WebElement newReservatinoHeader;
	
		//Vehicle locators
	
		@FindBy (css = "button[class*='add-new']")
		public WebElement addAVehicleButton;
		
		@FindBy (css = "#license-plate")
		public WebElement licensePlateInputBox;
		
		@FindBy (css = "button[class*='flex-grow-1 ant-btn ant-btn-primary']")
		public WebElement VehicleConfirmButton;
		
		
		
		
		//Check in locators
		
		@FindBy (xpath = "(//button[@nzshape='circle']//fa-icon[@class='ng-fa-icon'])[3]")
		public WebElement checkInButton;
		
		@FindBy(xpath="//div[@class='ng-tns-c94-4 ant-picker-input ng-star-inserted']")
		public WebElement checkInOpenCalendar;
		
		@FindBy (xpath = "(//div[@class='ant-picker-cell-inner ng-star-inserted'])[16]")    // this is 15th of Nov
		public WebElement checkInDate;
		
		@FindBy (css = "nz-time-picker[id='time-picker']")
		public WebElement checkInOpenTimeDropdown;
		
		@FindBy (xpath = "//li[@class='ant-picker-now']")
		public WebElement checkIntimeNow;

		@FindBy (xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-circle'])[1]")
		public WebElement checkInConfirmButton;
		
		
		
		
		//Check out locators
		
		@FindBy (css = "svg[class*='svg-inline--fa fa-calendar fa-w-14']")
		public WebElement checkOutButton;
		
		@FindBy (css = "div[class*='ant-picker-input ng-star-inserted']")
		public WebElement checkOutOpenCalendar;
		
		@FindBy (xpath = "//td[@title='11/17/2021']") //selecting 11/17
		public WebElement checkOutDate;
		
		
		@FindBy (css = "nz-time-picker[id='time-picker']>div>input")
		public WebElement checkOutTimeDropDown;
		
		
		@FindBy (xpath = "//li[@class='ant-picker-now']")
		public WebElement checkOuttimeNow;
		
		
		@FindBy (css = "date-time-edit[class='ng-star-inserted'] div[class='actions d-none d-md-block']>button:nth-child(2)>fa-icon") // blue check mark
		public WebElement checkOutConfirmButton;
		

				
						

		@FindBy (xpath = "(//span[contains(text(),' Select a parking spot ')])[2]")
		public WebElement selectParkingSpotButton;
								
						
						

}
