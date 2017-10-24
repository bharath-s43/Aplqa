Feature: Brand Admin Flow

Scenario: Logout of super admin and login with customer admin
      When user logout of the portal
    When user enters the email id and password
      | Email Id | bharathmails01@gmail.com |
      | Password | abcd123          |
    Then clicks on login button
    
    
    Scenario: Create location with only mandatory fields
    When user clicks on the location menu	
    When user click on the Add new button
    Then user enters the location name
      | Location | Bush and Van Ness |
    Then enters the address
      | Address | 1401 Van Ness Avenue, San Francisco, CA 94109 |
    And click on the save button

  Scenario: Create employee with only mandatory fields
    Given user selects the location from the location dropdown
      | Location | Bush and Van Ness |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
      | First Name | Dennis |
      | Last Name  | Jones |
    Then user enters the employee id and role
      | Employee Id | FD4353   |
      | Role        | Clerk |
    And click on the save button

  Scenario: Assign beacon to location
    When user clicks on the beacon menu
    Then clicks on Assign individual button
    Then enters the beacon id
      | Beacon Id | 09sjl340djf033oi |
    And click on the save button

  Scenario: Pair beacon to an employee
    When user clicks on the beacon menu
    Then selects the beacon id
    Then clicks on Pair individual button
    Then enters the employee id
      | Employee Id | FD4353 |
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