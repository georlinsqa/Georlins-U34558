package Assessment_02062026;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownselection_02062026 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//Identify the element
		
		//single element
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		dropdown.click();
		
// get all options inside the dropdown
		
		List<WebElement> options = driver.findElements(By.tagName("option"));
		
	
		for(WebElement option : options) {
			if (option.getText().equals("Option 1")) {
				option.click();
				System.out.println("Selected Option1");
				break;
			}
			
		}
				driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
