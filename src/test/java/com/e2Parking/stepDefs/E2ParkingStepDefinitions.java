package com.e2Parking.stepDefs;

import java.util.concurrent.TimeUnit;

import com.e2Parking.pages.LandingPage;
import com.e2Parking.pages.NewReservationPage;
import com.e2Parking.pages.ReviewReservationPage;
import com.e2Parking.pages.SelectParkingSpotPage;
import com.e2Parking.pages.SpotConfPage;
import com.e2Parking.utilities.BrowserUtilities;
import com.e2Parking.utilities.ConfigReader;
import com.e2Parking.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class E2ParkingStepDefinitions {
	

@Given("the user is on home page")
public void theUserIsOnHomePage() {
	
	
	//These steps could be covered in Hooks class to set up/close the session after test 
	
	Driver.getDriver().manage().timeouts().implicitlyWait(
			Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
	Driver.getDriver().manage().window().maximize();
	
	Driver.getDriver().get(ConfigReader.getProperty("url"));
	
	
	
}

@When("the user clicks on Reserve A Spot button and validate Reservation Page header")
public void theUserClicksOnReserveASpotButtonAndValidateReservationPageHeader() {
    LandingPage lp = new LandingPage();
    lp.reserveASpotButton.click();
    BrowserUtilities.waitFor(5);
     
    
    //Validating the "New Reservation" header on the page 
    Assert.assertEquals("New Reservation", new NewReservationPage().newReservatinoHeader.getText());
    
}

@When("the user selects vehicle and check in chek out date")
public void theUserSelectsVehicleAndCheckInChekOutDate() {
	
	NewReservationPage nrp = new NewReservationPage();
	
	//Steps associated with vehicle selection
	nrp.addAVehicleButton.click();
	nrp.licensePlateInputBox.sendKeys("VDI1234");// this could be a method to input the license by user
	nrp.VehicleConfirmButton.click();
   
	
	//Steps associated with Check in
	 BrowserUtilities.waitFor(2);
	nrp.checkInButton.click();
	nrp.checkInOpenCalendar.click();
	nrp.checkInDate.click(); // this could be a method to select a particular date on the calendar
	nrp.checkInOpenTimeDropdown.click();
	nrp.checkIntimeNow.click();   // selecting time Now
	nrp.checkInConfirmButton.click();
	
	
	//Steps associated with Check out 
	 BrowserUtilities.waitFor(2);
	nrp.checkOutButton.click();
	nrp.checkOutOpenCalendar.click();
	nrp.checkOutDate.click();
	nrp.checkOutTimeDropDown.click();
	nrp.checkOuttimeNow.click();
	BrowserUtilities.waitFor(2);
	nrp.checkOutConfirmButton.click();
	
	
}

@When("the user clicks on Select a Parking Spot button and validates Select a Parking Spot header")
public void theUserClicksOnSelectAParkingSpotButtonAndValidatesSelectAParkingSpotHeader() {
   
	   //Clicking on enabled Select Parking Spot button
		 BrowserUtilities.waitFor(2);
		  new NewReservationPage().selectParkingSpotButton.click();
		
		  SelectParkingSpotPage sps = new SelectParkingSpotPage();
		//Validating the "Parking spot" header on the page 
	    Assert.assertEquals("Select a Parking Spot", sps.selectParkingSpotHeader.getText());
	    
	    //Selecting a spot 
	    sps.selectSpotButton.click();
}

@When("the user is able to review the parking spot")
public void theUserIsAbleToReviewTheParkingSpot() {
    
	//Here some logic could be added to validate the spot/vehicle # selected prior, also the edit option
	
	//Clicking on Review Reservation Button
	new SpotConfPage().ReviewReservationButton.click();
}

@Then("the user will be able to review selected reservation")
public void theUserWillBeAbleToReviewSelectedReservation() {
 
	//Validating the "Review of the Reservation" header on the page 
    Assert.assertEquals("Review of the Reservation", new ReviewReservationPage().reviewReservationHeader.getText());
    
    //Here some logic could be added to validate all the fields again the information the user has entered prior
    
  //Clicking on Review Reservation Button
    new ReviewReservationPage().makePaymentButton.click();
	
}

	

}
