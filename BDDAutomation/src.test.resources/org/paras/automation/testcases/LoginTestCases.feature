Feature: Facebook Login Functionality
Scenario: Login with valid credentials
Given User is on login page
When User enters username
And User enters Password
And User click on Signin button
Then User logged in successfully