package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerLoginPage {

	    static WebDriver driver;

	    private By customerLoginBtn = By.cssSelector("button[ng-click='customer()']");
	    private By customerDropdown = By.id("userSelect");
	    private By loginBtn = By.cssSelector("button[type='submit']");
	    private By logoutBtn = By.cssSelector(".logout");

	    public CustomerLoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void loginAsCustomer(String customerName) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        // Wait until Customer Login button is visible
	        wait.until(ExpectedConditions.elementToBeClickable(customerLoginBtn));
	        driver.findElement(customerLoginBtn).click();
	        wait.until(ExpectedConditions.elementToBeClickable(customerDropdown));
	        new Select(driver.findElement(customerDropdown)).selectByVisibleText(customerName);
	        driver.findElement(loginBtn).click();
	    }

	    public boolean isLogoutDisplayed() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    	// Wait until Customer Logout button is visible
	    	wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
	        return driver.findElement(logoutBtn).isDisplayed();
	    }
	}
