Feature: HotelBooking

Scenario: Invalid first name
Given user is on 'hotelBooking' page
When user enters invalid first name
Then displays 'Please fill the first Name'


Scenario: Invalid last name
Given user is on 'hotelBooking' page
When user enters invalid last name
Then displays 'Please fill the Last Name'

Scenario: Invalid Email
Given user is on 'hotelBooking' page
When user enters invalid email
Then display 'Please fill the Email' 


Scenario: Invalid Mobile Number
Given user is on 'hotelBooking' page
When user enters invalid mobile number
Then display 'Please fill Mobile No.'

Scenario: Wrong Mobile Number
Given user is on 'hotelBooking' page
When user enters wrong mobile number
Then display 'Please enter valid Mobile Number'


Scenario: Invalid Number of People staying

Given user is on 'hotelBooking' page
When user enters invalid Number of People staying
Then display 'Number of people staying' 

Scenario: Invalid Address
Given user is on 'hotelBooking' page
When user does not enter address
Then display 'Please Enter Address'

Scenario: Invalid City

Given user is on 'hotelBooking' page
When user enters invalid City
Then display 'Please fill City' 

Scenario: Invalid State

Given user is on 'hotelBooking' page
When user enters invalid State
Then display 'Please fill the State' 

Scenario: Invalid cardHolder name

Given user is on 'hotelBooking' page
When user enters invalid name
Then displays 'Please fill the CardHolder Name'

Scenario: Invalid Debit Card Number

Given user is on 'hotelBooking' page
When user enters invalid Debit Card Number
Then displays 'Please fill Debit Card Number'

Scenario: CVV Not entered
Given user is on 'hotelBooking' page
When user does not enter CVV value
Then displays 'Please fill CVV number'

Scenario: Invalid expiration month

Given user is on 'hotelBooking' page
When user enters invalid expiration month
Then displays 'Please fill expiration month'
  
Scenario: Invalid expiration year

Given user is on 'hotelBooking' page
When user enters invalid expiration year
Then displays 'Please fill expiration year'
  
Scenario: Valid Booking details

Given user is on 'hotelBooking' page
When user enters valid  payment details
Then displays 'Booking Completed!!!' 