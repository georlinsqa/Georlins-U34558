package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			driver = new ChromeDriver ();
			driver.get("https://www.saucedemo.com");
			
			driver.manage().window().maximize();
			
			//fetch the title of the webpage and print it on the console
			
			String title = driver.getTitle();
			System.out.println(title);
			
			//get current url and print it on the console
			
			String currentURL = driver.getCurrentUrl();
			String ExcectedURL = "https://www.saucedemo.com/";
			System.out.println(currentURL);
			
			//get Page source and print it on the console
			
			String pagesource = driver.getPageSource();
			System.out.println(pagesource);
			
			
			if(currentURL.equals(ExcectedURL)) {
				System.out.println("The current URL is correct");
			}
			else {
				System.out.println("The current URL is incorrect");
				}} catch(Exception e) {
				e.printStackTrace();
				}
				
					

	}

}
