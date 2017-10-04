Feature: Testing with only mandatory fields

  Scenario: Login via admin
    Given go to applause portal
    When user enters the email id and password
      | Email Id | admin@meimodo.com |
      | Password | password          |
    Then clicks on login button

  Scenario: Create customer with only mandatory fields
    Given user clicks on the customer menu
    When user click on the Add new button
    Then user enters the customer name
      | Customer | Hertz Corporation |
    And click on the save button

  Scenario: Create brand with only mandatory fields
    Given user selects the customer from the customer dropdown
     | Customer | Hertz Corporation |
    When user clicks on the brand menu
    When user click on the Add new button
    Then user enters the brand name
      | Brand  | Hertz |
    Then selects the rating image
    And click on the save button

  Scenario: Create location with only mandatory fields
    Given user selects the brand from the brand dropdown
    | Brand  | Hertz |
    When user clicks on the location menu
    When user click on the Add new button
    Then user enters the location name
      | Location | SFO airport |
    Then enters the address
      | Address | San Francisco, CA 94128 |
    And click on the save button

  Scenario: Create employee with only mandatory fields
    Given user selects the location from the location dropdown
      | Location | SFO airport |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
   
      | First Name | Alex    |
      | Last Name  | Lampert |
    Then user enters the employee id and role
     
      | Employee Id | AF453   |
      | Role        | Manager |
    And click on the save button
    
   Scenario: Assign beacon to location
    When user clicks on the beacon menu
    Then clicks on Assign individual button
    Then enters the beacon id
    | Beacon Id | 348fd8ddfn5f7fg7    |
    And click on the save button
    
    Scenario: Pair beacon to an employee
    When user clicks on the beacon menu
    Then selects the beacon id
    Then clicks on Pair individual button
    Then enters the employee id
    | Employee Id | AF453   |
   Then click on search
   And click on Pair button
    
