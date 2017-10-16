 Feature: Customer Admin 2 Flow
 
 
 Scenario: Create brand by entering all the fields
    When user clicks on the brand menu
    When user click on the Add new button
    Then user enters the brand name
      | Brand | Westin |
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
    Then user enters all other location fields
      | Location Beacon            | 65544-32377       |
      | Latitude                   |           33.9803 |
      | Longitude                  |          118.4517 |
      | Interaction Radius         |                20 |
      | Primary Admin Name         | Razia Sultana     |
      | Primary Admin Email        | razia@gmail.com   |
      | Primary Admin Phone Number | 458-454-4544      |
      | Admin Name                 | Rahul Sharma      |
      | Admin Email                | rahul@hotmail.com |
      | Admin Phone Number         | (343)343-9874     |
    And click on the save button

  Scenario: Create employee by entering all the fields
    Given user selects the location from the location dropdown
      | Location | Marina Del Rey |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
      | First Name | Aamir |
      | Last Name  | Khan  |
    Then user enters the employee id and role
      | Employee Id | AL1E1              |
      | Role        | Multi-Unit Manager |
    Then user enters all other employee fields
    | Email Id | aamir_khan@gmail.com              |
      | Phone Number       | 917895484574 |
      | Department | Front Office              |
      | Personalization Value     | Cricket, Travelling | 
       | Start Date | 08/15/2010            |
    And click on the save button