Feature: Login and adding items to cart demo

@Background
Scenario: Lanuching the application and login

Given launch the application search for the login_button
When  users clicks on login_button link
And provides the email
Then Enter the password
And click on login button

Scenario: Select the category to buy

When user selects the Electronics category
Then clicks on AddTocart button
And clicks on shopping cart link

Scenario: Add one more item to the cart

When user selects the category of his own in cart
Then clicks on AddToCart button