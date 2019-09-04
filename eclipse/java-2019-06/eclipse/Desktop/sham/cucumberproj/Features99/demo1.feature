Feature: BDC validation on demoshop
@Sanity
Scenario: Registerd user access to cart in demowebshop

Given user launched demowebshop app in chrome browser
Then User searches for the item of his choice
And Adds that item to cart

@Regression
Scenario: Rgisterd user acess track the orderd item in demo shop

Given user has already placed an order for his favourite item
And User tries to access the order trackling dashboard
Then verifies the login status