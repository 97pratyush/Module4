package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginWebD {

	static WebDriver driver=null;
	static String alertMessage=null;

	public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver", "C:/StudyMaterial/BDD/chromedriver_win32/chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:/StudyMaterial/BDD/geckodriver-v0.24.0-win32/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///C:/StudyMaterial/BDD/hotelBooking/login.html");

		String actualTitle = driver.findElement(By.xpath("//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
	
		System.out.println("The page title is :" + actualTitle);

		/*driver.findElement(By.name("userName")).sendKeys("capgemini");
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		driver.findElement(By.className("btn")).click();	
*/
		//blank UserName
		driver.findElement(By.name("userName")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Correct UserName
		driver.findElement(By.name("userName")).sendKeys("capgemini");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    //blank Password
		driver.findElement(By.name("userPwd")).sendKeys("");
		driver.findElement(By.className("btn")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
        //Correct Password
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		driver.findElement(By.className("btn")).click();
		
	}

	public static void callAlert()
	{
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);		
		driver.switchTo().alert().accept();

	}


}
