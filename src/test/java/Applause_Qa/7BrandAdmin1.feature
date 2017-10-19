Feature: Brand Admin Flow

Scenario: Send the brand admin invitation mail
  When user clicks on the brand menu
  Then select the brand 
  Then click on Admin switch
  Then click on send invite
  Then verify the email and set password