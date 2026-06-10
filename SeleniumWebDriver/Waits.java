package SeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	static WebDriver driver;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		//implicit wait - is applicable for all the web elements in the web page and t will wait
		//for the specified time before throwing NoSuchElementException
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		//explicit wait is applicable for a specific element and it will wait for the specified time period
		
	    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    wait.until(d -> username.isDisplayed());
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		//Fluent wait is applicable to a specific web element and it will wait for the specified time and it will check for the condition at specified intervals before throwing No such element exception
		 Wait<WebDriver> wait1 =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(2))
			            .pollingEvery(Duration.ofMillis(300))
			            .ignoring(ElementNotInteractableException.class);

			    wait.until(
			        d -> {
			          password.sendKeys("Displayed");
			          return true;
			        });
		
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
