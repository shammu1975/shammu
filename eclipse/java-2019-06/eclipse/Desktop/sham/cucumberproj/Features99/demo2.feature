Feature: this is the demo 2

Scenario: User choice to opt for an account

Given User access the signup page
And geths the creadentials

Scenario: User acess to login page

Given User has valid account credentials for dev shop
And Provide the valid cred as inputs for the login process
Then verifies the state for the login status

