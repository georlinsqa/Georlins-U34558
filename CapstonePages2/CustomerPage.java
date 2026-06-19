package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerPage {

	    static WebDriver driver;

	    private By customersTab = By.cssSelector("button[ng-click='showCust()']");
	    private By searchInput = By.cssSelector("input[ng-model='searchCustomer']");

	    public CustomerPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void viewCustomers() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until Customers tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(customersTab));
	        driver.findElement(customersTab).click();
	    }

	    public void searchCustomer(String name) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until searchInput option to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
	        driver.findElement(searchInput).sendKeys(name);
	    }
	}
