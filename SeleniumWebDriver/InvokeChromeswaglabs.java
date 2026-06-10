package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeswaglabs {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the chromedriver using WebDriverManager

	WebDriverManager.chromedriver().setup();
	
	try {
		driver = new ChromeDriver ();
		driver.get("https://www.saucedemo.com/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
			
		// Close the current browser session
		
		driver.close();
			
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}