package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageFactory {
	
	WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(id="txtUserName")
	@CacheLookup
	WebElement pfuname;

	//using how class
		@FindBy(how=How.NAME, using="txtPwd")
		@CacheLookup
		WebElement pfpwd;
		
		@FindBy(className="Format")
		@CacheLookup
		WebElement pfcpwd;

		@FindBy(name="submit")
		@CacheLookup
		WebElement pfsubmit;
		
		public RegistrationPageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//setters
		public void setPfuname(String suname) {
			//this.pfuname = pfuname;
			//driver.findElement(By.id("txtUserName")).sendKeys("Amit123");
			pfuname.sendKeys(suname);
		}

		public void setPfpwd(String spwd) {
			//this.pfpwd = pfpwd;
			//driver.findElement(By.name("txtPwd")).sendKeys("igate");
			pfpwd.sendKeys(spwd);
		}

		public void setPfcpwd(String scpwd) {
			//this.pfcpwd = pfcpwd;
			//driver.findElement(By.className("Format")).sendKeys("igate");
			pfcpwd.sendKeys(scpwd);
			
		}

		public void setPfsubmit() {
			//this.pfsubmit = pfsubmit;
			pfsubmit.click();
		}
	
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public void navigateTo_NextPage(String pfuname, String pfpwd, String pfcpwd) {
			this.setPfuname(pfuname);
			this.setPfpwd(pfpwd);
			this.setPfcpwd(pfcpwd);
			this.setPfsubmit();
		}
}
