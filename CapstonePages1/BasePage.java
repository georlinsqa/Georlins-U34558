package CapstonePages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {


	    static WebDriver driver;

	    public static void setDriver(WebDriver webDriver) {
	        driver = webDriver;
	    }

	    public void click(By locator) {
	        try {
	            driver.findElement(locator).click();
	        } catch (Exception e) {
	            System.out.println("Error while clicking element: " + locator);
	        }
	    }

	    public void type(By locator, String text) {
	        try {
	            WebElement element = driver.findElement(locator);
	            element.clear();
	            element.sendKeys(text);
	        } catch (Exception e) {
	            System.out.println("Error while typing into element: " + locator);
	        }
	    }

	    public String getText(By locator) {
	        try {
	            return driver.findElement(locator).getText();
	        } catch (Exception e) {
	            System.out.println("Error when getting text from element: " + locator);
	            return null;
	        }
	    }

}
