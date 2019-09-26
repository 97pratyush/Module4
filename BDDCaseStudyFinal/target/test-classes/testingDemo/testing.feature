Feature: Testing using parameters

Scenario: User enter valid username and password 
Given user is on login page 
When user enters "Yogini" as username and "Yogini" as password 
Then displays hotelBooking page

Scenario: User enters wrong username and password
Given user is on login page
When user enters "Capgemini" as username and "capgemini" as password
Then displays 'Invalid username password ' 