package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriorityTestCases {
	
static WebDriver driver;
	
	@Test(priority = 1)

	public void test1() {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();

}

	}
	
	@Test(priority = 2)

	public void test2() {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();

}

	}
	
	@Test(enabled = false)

	public void test4() {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();

}

	}
	
	@Test(priority = 3)

	public void test3() {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
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