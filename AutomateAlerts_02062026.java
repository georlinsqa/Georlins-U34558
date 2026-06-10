package Assessment_02062026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateAlerts_02062026 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		//Identify the element
		
		WebElement infoalert = driver.findElement(By.xpath("//button[normalize-space()='Alert']"));
		
		infoalert.click();
		
		// alert is opened and we need to switch the control to the pop up
		
		Alert alt = driver.switchTo().alert();
		
		//click on Ok button
		
		alt.accept();
		
		Thread.sleep(3000);
		
		//button[@onclick='myMessage()']
		
		//Identify the element
		
		WebElement infoalertwithwait = driver.findElement(By.xpath("//button[@onclick='myMessage()']"));
		
		infoalertwithwait.click();
		
		//Wait till the alert is opened
		
		Thread.sleep(6000);
		
		// alert is opened and we need to switch the control to the pop up
		
		Alert alt1 = driver.switchTo().alert();
		
		//click on Ok button
		
		
		alt1.accept();
		
		Thread.sleep(3000);
		
		//confirmation alert
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='myDesk()']"));
		
		confirmalert.click();
		
		// click on the cancel button
		
		Alert alt2 = driver.switchTo().alert();
		
		alt2.dismiss();	
		
		Thread.sleep(3000);
		
		//Prompt Alert
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='myPromp()']"));
		
		promptalert.click();
		
		Alert alt3 = driver.switchTo().alert();
		
		alt3.sendKeys("Selenium Webdriver");
		
		//click on ok button on the pop up
		
		alt3.accept();
		
		Thread.sleep(3000);	
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
