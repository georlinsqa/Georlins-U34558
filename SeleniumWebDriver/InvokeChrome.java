package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChrome {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the chromedriver using WebDriverManager

	WebDriverManager.chromedriver().setup();
	
	try {
		driver = new ChromeDriver ();
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