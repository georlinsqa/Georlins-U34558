package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdge {
	
	
	static WebDriver driver;
	
	@Test

	public void invokeEdgeBrowser() {
		
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