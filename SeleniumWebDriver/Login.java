package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	static WebDriver driver;
	
	@Test

	public void loginTest() {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginbutton.click();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String ExpectedTitle = "OrangeHRM";
		
		if(title.equals(ExpectedTitle)) {
			System.out.println("The title is correct");}
		else
		{System.out.println("The title is incorrect");}
		
		
		
		
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}

}

}
