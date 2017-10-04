Feature: Testing by entering all the fields

 Scenario: Login via admin
    Given go to applause portal
    When user enters the email id and password
      | Email Id | admin@meimodo.com |
      | Password | password          |
    Then clicks on login button


  Scenario: Create customer by entering all the fields
    Given user clicks on the customer menu
    When user click on the Add new button
    Then user enters the customer name
      | Customer | Marriott Hotels & Resorts Worldwide, Inc. |
    Then user enters all other customer fields
      | Address                    | 10400 Fernwood Road, Bethesda, MD 20817 |
      | Primary Admin Name         | Rohit Khanna |
      | Primary Admin Email        | rohit@gmail.com |
      | Primary Admin Phone Number | 7845481545 |
      | Admin Name                 | Arvind Singh |
      | Admin Email                | arvind@gmail.com |
      | Admin Phone Number         | 785-848-5466 |
    And click on the save button

  Scenario: Create brand by entering all the fields
    Given user selects the customer from the customer dropdown
    | Customer | Marriott Hotels & Resorts Worldwide, Inc. |
    When user clicks on the brand menu
    When user click on the Add new button
    Then user enters the brand name
      | Brand  | The Ritz Carlton |
    Then selects the rating image
    Then user enters all other brand fields
      | Primary Color Red          | 196 |
      | Primary Color Green        | 221 |
      | Primary Color Blue         | 224 |
      | Primary Color Alpha        | 1 |
      | Secondary Color Red        | 28 |
      | Secondary Color Green      | 28 |
      | Secondary Color Blue       | 28 |
      | Secondary Color Alpha      | 1 |
      | Primary Admin Name         | Ashish Khanna |
      | Primary Admin Email        | ashish@yahoo.com |
      | Primary Admin Phone Number | (585)854-0787 |
      | Admin Name                 | Mike Granger |
      | Admin Email                | mike_granger@gmail.com |
      | Admin Phone Number         | 5545564845 |
      | Personlization Prefix      | Passions |
    And click on the save button

  Scenario: Create location by entering all the fields
    Given user selects the brand from the brand dropdown
     | Brand  | The Ritz Carlton |
    When user clicks on the location menu
    When user click on the Add new button
    Then user enters the location name
      | Location | Marina Del Rey  |
    Then enters the address
      | Address | 4375 Admiralty Way, Marina del Rey, California 90292 United States |
    Then user enters all other location fields
     | Location Beacon | 45655-54545 |
      | Latitude | 33.9803 |
       | Longitude | 118.4517 |
        | Interaction Radius | 20 |
        | Primary Admin Name         | Razia Sultana |
      | Primary Admin Email        | razia@gmail.com |
      | Primary Admin Phone Number | 458-454-4544 |
      | Admin Name                 | Rahul Sharma |
      | Admin Email                | rahul@hotmail.com |
      | Admin Phone Number         | (343)343-9874|
           
    And click on the save button

  Scenario: Create employee by entering all the fields
    Given user selects the location from the location dropdown
    | Location | Marina Del Rey  |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
     |First Name | Aamir |
      | Last Name | Khan |
    Then user enters the employee id and role
     | Employee Id | AL1E1 |
      | Role | Multi-Unit Manager |
    Then user enters all other employee fields
     | Email | aamir.khan@gmail.com|
      | Phone Number | 9178394793749 |
      | Department | Front Office |
      | Personalization Value | Cricket, Travelling |
       | Start Date | 07/25/2010 |
    And click on the save button
