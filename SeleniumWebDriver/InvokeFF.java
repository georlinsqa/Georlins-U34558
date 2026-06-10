package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFF {
	
	
	static WebDriver driver;
	
	@Test

	public void invokeFFBrowser() {
		
		// set up the chromedriver using WebDriverManager

	WebDriverManager.firefoxdriver().setup();
	
	try {
		driver = new FirefoxDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}

}
}