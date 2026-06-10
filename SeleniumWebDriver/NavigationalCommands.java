package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			driver = new ChromeDriver ();
			driver.get("https://www.saucedemo.com");
			
			driver.manage().window().maximize();
			
	//driver back
			driver.navigate().back();
			
			//java command to wait for 4 seconds
			Thread.sleep(4000);
			
// driver.forward;
			
			driver.navigate().forward();
			
			//java command to wait for 4 seconds
			Thread.sleep(4000);		
			
			// driver.refresh;
			
						driver.navigate().refresh();
						
						//java command to wait for 4 seconds
						Thread.sleep(4000);	
						
						//close the current browser session
						driver.close();
						
						//driver quit - will close all the browser sessions opened by browser
						
						//driver.quit();
						
						
								
		}catch(Exception e) {
		e.printStackTrace();

}
}
}