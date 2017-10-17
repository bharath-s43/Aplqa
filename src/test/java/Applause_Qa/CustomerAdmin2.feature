  Feature: Customer Admin 2 Flow
 
 
 Scenario: Create brand by entering all the fields
    When user clicks on the brand menu
    When user click on the Add new button
    Then user enters the brand name
      | Brand | Westin |
       Then user upload the brand image
      |ImagePath | \\Images\\Westin.png |
    Then selects the rating image
    Then user enters all other brand fields
      | Primary Color Red          |                    178 |
      | Primary Color Green        |                    220 |
      | Primary Color Blue         |                    202 |
      | Primary Color Alpha        |                      1 |
      | Secondary Color Red        |                     81 |
      | Secondary Color Green      |                     85 |
      | Secondary Color Blue       |                     90 |
      | Secondary Color Alpha      |                      1 |
      | Primary Admin Name         | Ram Kapoor          |
      | Primary Admin Email        | ramkap@yahoo.com       |
      | Primary Admin Phone Number | (434)324-4243          |
      | Admin Name                 | Tony Greinger           |
      | Admin Email                | bharathmails01@gmail.com |
      | Admin Phone Number         |             4645646444 |
      | Personlization Prefix      | Good at               |
    And click on the save button

  Scenario: Create location by entering all the fields
    Given user selects the brand from the brand dropdown
      | Brand | Westin |
    When user clicks on the location menu
    When user click on the Add new button
    Then user enters the location name
      | Location | Kierland Villas Scott |
    Then enters the address
      | Address | 15620 N Clubgate Dr, Scottsdale, AZ 85254 |
       Then user upload the location image
       |ImagePath | \\Images\\KierlandVillasScott.jpg |
    Then user enters all other location fields
      | Location Beacon            | 65544-32377       |
      | Latitude                   |           33.629356 |
      | Longitude                  |         -111.938205 |
      | Interaction Radius         |                20 |
      | Primary Admin Name         | Rakesh Sharma     |
      | Primary Admin Email        | rakesh@gmail.com   |
      | Primary Admin Phone Number | 543-354-3454     |
      | Admin Name                 | Arun Jat      |
      | Admin Email                | arun@hotmail.com |
      | Admin Phone Number         | (354)345-3453    |
    And click on the save button

  Scenario: Create employee by entering all the fields
    Given user selects the location from the location dropdown
      | Location | Kierland Villas Scott |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
      | First Name | Jonathan |
      | Last Name  | Mac  |
        Then user upload the employee image
        |ImagePath | \\Images\\JonathanMac.jpg |
    Then user enters the employee id and role
      | Employee Id | GR4343             |
      | Role        | Multi-Unit Manager |
    Then user enters all other employee fields
    | Email Id | jon_mac@gmail.com              |
      | Phone Number       | 918485245454 |
      | Department | Front Office              |
      | Personalization Value     | Music, Travelling | 
       | Start Date | 12/25/2012            |
    And click on the save button