  @smoke @ui
  Feature: Reserve A Spot
  
  Scenario: Validating ability to click on Reserve A Spot button
    
    Given the user is on home page
    When the user clicks on Reserve A Spot button and validate Reservation Page header
    And the user selects vehicle and check in chek out date 
    And the user clicks on Select a Parking Spot button and validates Select a Parking Spot header
    And the user is able to review the parking spot
    Then the user will be able to review selected reservation
    
    
    
    
    
   
   

    
    