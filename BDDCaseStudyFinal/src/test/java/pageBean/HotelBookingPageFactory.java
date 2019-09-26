package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
	WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement firstName;

	//using how class
	@FindBy(how=How.ID, using="btnPayment")
	@CacheLookup
	WebElement confirmButton;

	@FindBy(xpath="//*[@id='txtLastName']")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how=How.NAME, using="Email")
	@CacheLookup
	WebElement email;

	@FindBy(css="input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement mobileNo;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement state;

	@FindBy(how=How.NAME, using="persons")
	@CacheLookup
	int personCount;

	@FindBy(xpath="//*[@id='rooms']")
	@CacheLookup
	WebElement rooms;
	
	@FindBy(how=How.ID, using="txtCardholderName")
	@CacheLookup
	WebElement cardHolderName;

	@FindBy(id="txtDebit")
	@CacheLookup
	WebElement debitNo;

	@FindBy(name="cvv")
	@CacheLookup
	WebElement cvv;
	
	@FindBy(id="txtMonth")
	@CacheLookup
	WebElement expiryMonth;
	
	@FindBy(id="txtYear")
	@CacheLookup
	WebElement year;
	
	public WebElement getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public WebElement getConfirmButton() {
		return confirmButton;
	}
	public void setConfirmButton() {
		this.confirmButton.click();
	}
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	public WebElement getState() {
		return state;
	}
	public void setState(String state) {
		this.state.sendKeys(state);
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo.sendKeys(mobileNo);
	}
	public int getPersonCount() {
		return personCount;
	}
	public void setPersonCount(int personCount) {
		this.personCount=personCount;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public void setRooms(String rooms) {
		this.rooms.sendKeys(rooms);
	}
	public WebElement getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}
public WebElement getDebitNo() {
		return debitNo;
	}
	public void setDebitNo(String debitNo) {
		this.debitNo.sendKeys(debitNo);
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth.sendKeys(expiryMonth);;
	}
  //initiating Elements
	public HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
