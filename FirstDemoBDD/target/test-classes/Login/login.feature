#Author Varsha Lonkar

Feature: User Login
This is to test successful login for any type of User

Background: User is on Login Page


Scenario: Successful User Login

Given User is on Log in page
When  User enters valid credentials 
Then Display Alert message as "You have Successfully Logged in..."

Scenario: Unsuccessful User Login

Given User is on Log in page
When  User enters invalid credentials 
Then Display Error message as "You have enetered wrong credentials..."