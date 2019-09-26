Feature: hotelBookingLogin

Scenario: Invalid UserName 
Given User is on 'login' Page
When user enters invalid UserName
Then display 'Please Enter UserName' 

Scenario: Invalid Password
Given User is on 'login' Page
When user enters invalid password
Then display 'Please Enter Password' 

Scenario: Invalid Details
Given User is on 'login' Page
When user enters invalid details
Then display 'Invalid Login Please try again'

Scenario: Valid Details
Given User is on 'login' Page
When user enters valid details
Then display 'HotelBooking' Page