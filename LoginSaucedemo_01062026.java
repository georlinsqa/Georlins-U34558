package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSaucedemo_01062026 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the chromedriver using WebDriverManager

	WebDriverManager.chromedriver().setup();
	
	try {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		loginbutton.click();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String ExpectedTitle = "Swag Labs";
		
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
