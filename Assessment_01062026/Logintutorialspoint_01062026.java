package Assessment_01062026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintutorialspoint_01062026 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the chromedriver using WebDriverManager

	WebDriverManager.chromedriver().setup();
	
	try {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		email.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password.sendKeys("secret_demo");
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		
		login.click();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
				
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
