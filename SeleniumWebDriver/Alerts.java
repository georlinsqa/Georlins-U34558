package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		//Identify the element
		
		WebElement infoalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		
		infoalert.click();
		
		// alert is opened and we need to switch the control to the pop up
		
		Alert alt = driver.switchTo().alert();
		
		//click on Ok button
		
		alt.accept();
		
		Thread.sleep(3000);
		
		//confirmation alert
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		
		confirmalert.click();
		
		// click on the cancel button
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.dismiss();	
		
		Thread.sleep(3000);
		
		//Prompt Alert
		
		WebElement promptalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		
		promptalert.click();
		
		Alert alt2 = driver.switchTo().alert();
		
		alt2.sendKeys("Selenium Webdriver");
		
		//click on ok button on the pop up
		
		alt2.accept();
		
				
		// Close the current browser session
		
		//driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
