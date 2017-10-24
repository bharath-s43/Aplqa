Feature: Bulk upload feature


Scenario: Assign bulk 
  When user clicks on the beacon menu
  Then user clicks on the bulk action
  Then user clicks on the assign link
  Then upload the csv file to Assign Beacons
   And click on the save button
   
   
   Scenario: Employee bulk 
  When user clicks on the employee menu
  Then click on the Add in bulk button
  Then upload the csv file to Employee details
  Then upload the zip file to images
   And click on the save button
   
 Scenario: Pair bulk 
  When user clicks on the beacon menu
  Then user clicks on the bulk action
  Then user clicks on the Pair link
  Then upload the csv file to Pair Beacons
   And click on the save button
   
 Scenario: Unpair bulk 
  When user clicks on the beacon menu
  Then user clicks on the bulk action
  Then user clicks on the Unpair link
  Then upload the csv file to Unpair Beacons
   And click on the save button
   
   Scenario: Unassign bulk 
  When user clicks on the beacon menu
  Then user clicks on the bulk action
  Then user clicks on the Unassign link
  Then upload the csv file to Unassign Beacons
   And click on the save button
   
  Scenario: Send the customer admin invitation mail
  When user clicks on the customer menu
 Then select the customer/brand/location 
  Then click on send invite
  Then verify the email and set password
  | Email Id | bharathsb43@gmail.com |
  | Password| #abcd123 |
  
 
   
   
   
   
   
   
   
   