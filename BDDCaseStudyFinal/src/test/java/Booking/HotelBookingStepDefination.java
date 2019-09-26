package Booking;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;

public class HotelBookingStepDefination {
	private WebDriver driver;
	private HotelBookingPageFactory bookingPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Setup/chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	@Given("^user is on 'hotelBooking' page$")
	public void user_is_on_hotelBooking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.get("C:\\Capgemini\\Module 4\\Demos\\BDDCaseStudyFinal\\hotelbooking.html");
	bookingPageFactory= new HotelBookingPageFactory(driver);

	}
	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	bookingPageFactory.setFirstName("");
	bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill the first Name'$")
	public void displays_Please_fill_the_first_Name() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("");
		bookingPageFactory.setConfirmButton();
		
	}

	@Then("^displays 'Please fill the Last Name'$")
	public void displays_Please_fill_the_Last_Name() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^display 'Please fill the Email'$")
	public void display_Please_fill_the_Email() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^user enters invalid mobile number$")
	public void user_enters_invalid_mobile_number() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^display 'Please fill Mobile No\\.'$")
	public void display_Please_fill_Mobile_No() throws Throwable {
		String expectedMessage="Please fill the Mobile No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^user enters wrong mobile number$")
	public void user_enters_wrong_mobile_number() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("3454");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^display 'Please enter valid Mobile Number'$")
	public void display_Please_enter_valid_Mobile_Number() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Number of People staying$")
	public void user_enters_invalid_Number_of_People_staying() throws Throwable {
	/*	bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9922010130");
		
		bookingPageFactory.setConfirmButton();
	*/
	}

	@Then("^display 'Number of people staying'$")
	public void display_Number_of_people_staying() throws Throwable {
	/*	String expectedMessage="Please ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	*/}

	@When("^user does not enter address$")
	public void user_does_not_enter_address() throws Throwable {
	
	}

	@Then("^display 'Please Enter Address'$")
	public void display_Please_Enter_Address() throws Throwable {
	}

	@When("^user enters invalid City$")
	public void user_enters_invalid_City() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9922020203");
		bookingPageFactory.setCity("Select City");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^display 'Please fill City'$")
	public void display_Please_fill_City() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid State$")
	public void user_enters_invalid_State() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9923202012");
		bookingPageFactory.setCity("Pune");
		bookingPageFactory.setState("Select State");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^display 'Please fill the State'$")
	public void display_Please_fill_the_State() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid name$")
	public void user_enters_invalid_name() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9023020312");
		bookingPageFactory.setCity("Pune");
		bookingPageFactory.setState("Maharashtra");
		bookingPageFactory.setPersonCount(2);
		bookingPageFactory.setCardHolderName("");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^displays 'Please fill the CardHolder Name'$")
	public void displays_Please_fill_the_CardHolder_Name() throws Throwable {
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Debit Card Number$")
	public void user_enters_invalid_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9023020312");
		bookingPageFactory.setCity("Pune");
		bookingPageFactory.setState("Maharashtra");
		bookingPageFactory.setPersonCount(2);
		bookingPageFactory.setCardHolderName("Yogini Naik");
		bookingPageFactory.setDebitNo("");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^displays 'Please fill Debit Card Number'$")
	public void displays_Please_fill_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
@When("^user does not enter CVV value$")
public void user_does_not_enter_CVV_value() throws Throwable {
	bookingPageFactory.setFirstName("Yogini");
	bookingPageFactory.setLastName("Naik");
	bookingPageFactory.setEmail("yogini@gmail.com");
	bookingPageFactory.setMobileNo("9023020312");
	bookingPageFactory.setCity("Pune");
	bookingPageFactory.setState("Maharashtra");
	bookingPageFactory.setPersonCount(2);
	bookingPageFactory.setCardHolderName("Yogini Naik");
	bookingPageFactory.setDebitNo("42342");
	bookingPageFactory.setCvv("");
	bookingPageFactory.setConfirmButton();
}

@Then("^displays 'Please fill CVV number'$")
public void displays_Please_fill_CVV_number() throws Throwable {
	String expectedMessage="Please fill the CVV";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}
	@When("^user enters invalid expiration month$")
	public void user_enters_invalid_expiration_month() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9023020312");
		bookingPageFactory.setCity("Pune");
		bookingPageFactory.setState("Maharashtra");
		bookingPageFactory.setPersonCount(2);
		bookingPageFactory.setCardHolderName("Yogini Naik");
		bookingPageFactory.setDebitNo("42342");
		bookingPageFactory.setCvv("343");
		bookingPageFactory.setExpiryMonth("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill expiration month'$")
	public void displays_Please_fill_expiration_month() throws Throwable {
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid expiration year$")
	public void user_enters_invalid_expiration_year() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9023020312");
		bookingPageFactory.setCity("Pune");
		bookingPageFactory.setState("Maharashtra");
		bookingPageFactory.setPersonCount(2);
		bookingPageFactory.setCardHolderName("Yogini Naik");
		bookingPageFactory.setDebitNo("42342");
		bookingPageFactory.setCvv("343");
		bookingPageFactory.setExpiryMonth("3");
		bookingPageFactory.setYear("");
	bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill expiration year'$")
	public void displays_Please_fill_expiration_year() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	@When("^user enters valid  payment details$")
	public void user_enters_valid_payment_details() throws Throwable {
		bookingPageFactory.setFirstName("Yogini");
		bookingPageFactory.setLastName("Naik");
		bookingPageFactory.setEmail("yogini@gmail.com");
		bookingPageFactory.setMobileNo("9012102023");
		bookingPageFactory.setCity("Pune");
		bookingPageFactory.setState("Maharashtra");
		bookingPageFactory.setPersonCount(2);
		bookingPageFactory.setCardHolderName("Yogini Naik");
		bookingPageFactory.setDebitNo("902010101");
		bookingPageFactory.setCvv("4323");
		bookingPageFactory.setExpiryMonth("2");
		bookingPageFactory.setYear("2015");
		bookingPageFactory.setConfirmButton();
	
	}

	@Then("^displays 'Booking Completed!!!'$")
	public void displays_Booking_Completed() throws Throwable {
	driver.get("C:\\Capgemini\\Module 4\\Demos\\BDDCaseStudyFinal\\success.html");
	driver.close();
	}
}
