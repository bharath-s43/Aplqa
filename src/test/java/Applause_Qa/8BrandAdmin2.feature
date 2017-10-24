  Feature: Brand Admin 2 Flow
 

  Scenario: Create location by entering all the fields
    Given user selects the brand from the brand dropdown
      | Brand | Westin |
    When user clicks on the location menu
    When user click on the Add new button
    Then user enters the location name
      | Location | CPMC - 3801 Sacramento Street |
    Then enters the address
      | Address | 3801 Sacramento Street Suite 216, San Francisco, CA 94118 |
       Then user upload the location image
       |ImagePath | \\Images\\CPMC.jpg |
    Then user enters all other location fields
      | Location Beacon            | 34534-33453       |
      | Latitude                   |           37.773972 |
      | Longitude                  |        -122.431297 |
      | Interaction Radius         |                50 |
      | Primary Admin Name         | Alain Berset     |
      | Primary Admin Email        | Alain@gmail.com   |
      | Primary Admin Phone Number | 234-654-3453     |
      | Admin Name                 | Doris Leuthard    |
      | Admin Email                | bharathmail801@gmail.com |
      | Admin Phone Number         | (567)456-3335    |
    And click on the save button

  Scenario: Create employee by entering all the fields
    Given user selects the location from the location dropdown
      | Location | CPMC - 3801 Sacramento Street |
    When user clicks on the employee menu
    When user click on the Add new button
    Then user enters the employee first name and last name
      | First Name | Martin |
      | Last Name  | Bäumle  |
        Then user upload the employee image
        |ImagePath | \\Images\\MartinBäumle.jpg |
    Then user enters the employee id and role
      | Employee Id | 897354             |
      | Role        | Cover Writer |
    Then user enters all other employee fields
    | Email Id | jon_mac@gmail.com              |
      | Phone Number       | 917899687667 |
      | Department | Media           |
      | Personalization Value     | Music, Travelling | 
       | Start Date | 09/25/1999            |
    And click on the save button