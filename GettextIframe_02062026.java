package Assessment_02062026;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettextIframe_02062026 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

	WebDriverManager.edgedriver().setup();
	
	try {
		driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
		//Maximize browser window
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		//Identify the webelement
		
		
		//WebElement frame = driver.findElement(By.className("demo-frame"));
			
		//driver.switchTo().frame(frame);
		
		driver.switchTo().frame(0);
		
		WebElement frametext = driver.findElement(By.tagName("h1"));
		
		String text = frametext.getText();
		
		System.out.println("The text inside the iframe is : "+text);		
		
		// Close the current browser session
		
		driver.close();
			

	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
