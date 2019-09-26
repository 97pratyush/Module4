package hotelLogin;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// pageBean.HotelLoginPageFactory;
import pageBean.HotelLoginPageFactory;

public class LoginStepDefination {

	private WebDriver driver;
	private HotelLoginPageFactory loginPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Setup/chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^User is on 'login' Page$")
	public void user_is_on_login_Page() throws Throwable {
	
		driver.get("C:\\Capgemini\\Module 4\\Demos\\BDDCaseStudyFinal\\login.html");
		
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPageFactory = new HotelLoginPageFactory(driver);

	}

	@When("^user enters invalid UserName$")
	public void user_enters_invalid_UserName() throws Throwable {
		loginPageFactory.setUserName("");
		loginPageFactory.setLoginButton();
		
		
	}

	@Then("^display 'Please Enter UserName'$")
	public void display_Please_Enter_UserName() throws Throwable {
		String expectedMessage="* Please enter userName.";
		String actualMessage=loginPageFactory.getUsernameError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		loginPageFactory.setUserName("yogini");
		loginPageFactory.setPassword("");
		loginPageFactory.setLoginButton();

	}

	@Then("^display 'Please Enter Password'$")
	public void display_Please_Enter_Password() throws Throwable {
		String expectedMessage="* Please enter password.";
		String actualMessage=loginPageFactory.getPasswordError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	

	}

@When("^user enters invalid details$")
public void user_enters_invalid_details() throws Throwable {
	loginPageFactory.setUserName("yogini");
	loginPageFactory.setPassword("yogini");
	loginPageFactory.setLoginButton();

}

@Then("^display 'Invalid Login Please try again'$")
public void display_Invalid_Login_Please_try_again() throws Throwable {
	String expectedMessage="Invalid login! Please try again!";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		loginPageFactory.setUserName("Yogini");
		loginPageFactory.setPassword("Yogini");
		loginPageFactory.setLoginButton();
	
	}

	@Then("^display 'HotelBooking' Page$")
	public void display_HotelBooking_Page() throws Throwable {
		driver.get("C:\\\\Capgemini\\\\Module 4\\\\Demos\\\\BDDCaseStudyFinal\\\\hotelbooking.html");
	//	driver.close();
	}


}