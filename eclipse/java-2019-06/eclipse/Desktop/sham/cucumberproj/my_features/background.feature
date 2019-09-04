Feature: background demo

@Background
Scenario: User choice to opt for an account

Given User access the signup page
And geths the creadentials


Scenario: Rgisterd user acess track the orderd item in demo shop

Given user has already placed an order for his favourite item
And User tries to access the order trackling dashboard
Then verifies the login status

Scenario: User acess to login page

Given User has valid account credentials for dev shop
And Provide the valid cred as inputs for the login process
Then verifies the state for the login status
