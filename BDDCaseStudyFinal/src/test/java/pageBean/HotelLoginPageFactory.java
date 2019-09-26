package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPageFactory {

WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="userName")
	@CacheLookup
	WebElement userName;

	@FindBy(xpath="//*[@id=\"userErrMsg\"]")
	WebElement usernameError;
	
	@FindBy(xpath="//*[@id=\"pwdErrMsg\"]")
	WebElement passwordError;


	//using how class
	@FindBy(how=How.NAME, using="userPwd")
	@CacheLookup
	WebElement password;

	@FindBy(className="btn")
	@CacheLookup
	WebElement loginButton;
	
	//initiating the elements
	public HotelLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton() {
		this.loginButton.click();
	}

	public WebElement getUsernameError() {
		return usernameError;
	}
	
	public WebElement getPasswordError() {
		return passwordError;
	}

	public void setPasswordError(WebElement passwordError) {
		this.passwordError = passwordError;
	}
	

			
}
