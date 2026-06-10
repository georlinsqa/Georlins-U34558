package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		//Identify the element
		
		//single element
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		checkbox.click();
		
		checkbox.click();
		
		Thread.sleep(8000);
		
		//radio button
		
		//single element
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio2']"));
		
		radiobutton.click();
		
		//multiple elements
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//Input[@Type = 'checkbox']"));
		
		int count = checkboxes.size();
		
		System.out.println("The number of checkboxes is "+count);
		
		Thread.sleep(30000);
		
		// for loop to click on all checkboxes
		
		for(int i=0; i<count; i++) {
			checkboxes.get(i).click();
			String checkboxtext = checkboxes.get(i).getAttribute("Value");
			System.out.println("Checkbox "+ (i+1) +": "+checkboxtext);
			Thread.sleep(1000);
		}

		
		// Close the current browser session
		
		//driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
