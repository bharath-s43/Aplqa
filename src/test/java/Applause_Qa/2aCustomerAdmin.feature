Feature: Customer Admin Flow


  Scenario: Logout of super admin and login with customer admin
      When user logout of the portal
    When user enters the email id and password
      | Email Id | bharathsb43@gmail.com |
      | Password | abcd123          |
    Then clicks on login button
    
    Scenario: Create brand with only mandatory fields using customer admin
    When user clicks on the brand menu
    When user click on the Add new button
    Then user enters the brand name
      | Brand | St. Regis |
    Then selects the rating image
    And click on the save button
    
    Scenario: Create location with only mandatory fields
    Given user selects the brand from the brand dropdown
      | Brand | St. Regis |
    When user clicks on the location menu	
    When user click on the Add new button
    Then user enters the location name
      | Location | Punta Mita |
    Then enters the address
      | Address | Carretera Federal La Cruz de Huanacaxtle - Punta de Mita Km.19.5, 63734 Punta de Mita, Nay., Mexico |
    And click on the save button

  Scenario: Create employee with only mandatory fields
    Given user selects the location from the location dropdown
      | Location | Punta Mita |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
      | First Name | Bravo |
      | Last Name  | Lee |
    Then user enters the employee id and role
      | Employee Id | TM454   |
      | Role        | Associate |
    And click on the save button

  Scenario: Assign beacon to location
    When user clicks on the beacon menu
    Then clicks on Assign individual button
    Then enters the beacon id
      | Beacon Id | 90f8sdfs9fd0sdfd |
    And click on the save button

  Scenario: Pair beacon to an employee
    When user clicks on the beacon menu
    Then selects the beacon id
    Then clicks on Pair individual button
    Then enters the employee id
      | Employee Id | TM454 |
    Then click on search
    And click on Pair button

  Scenario: Unpair beacon from an employee
    When user clicks on the beacon menu
    Then selects the beacon id
    Then clicks the Unpair button
    Then clicks the Yes button

  Scenario: Unassign beacon from an employee
    Then selects the beacon id
    Then clicks the Unassign button
    Then clicks the Yes button
    