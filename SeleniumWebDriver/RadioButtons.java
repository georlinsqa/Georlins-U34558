package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		//multiple elements
		
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//Input[@Type = 'radio']"));
		
		int count = radiobuttons.size();
		
		System.out.println("The number of radiobuttons is "+count);
		
		Thread.sleep(20000);
		
		// for loop to click on all radiobuttons
		
		for(int i=0; i<count; i++) {
			radiobuttons.get(i).click();
			String radiobuttontext = radiobuttons.get(i).getAttribute("Value");
			System.out.println("Radio button "+ (i+1) +": "+radiobuttontext);
			Thread.sleep(1000);
		}

		
		// Close the current browser session
		
		//driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
