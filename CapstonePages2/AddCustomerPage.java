package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage {

	    static WebDriver driver;

	    private By addCustomerTab = By.cssSelector("button[ng-click='addCust()']");
	    private By firstName = By.cssSelector("input[ng-model='fName']");
	    private By lastName = By.cssSelector("input[ng-model='lName']");
	    private By postCode = By.cssSelector("input[ng-model='postCd']");
	    private By addBtn = By.cssSelector("button[type='submit']");

	    public AddCustomerPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void addCustomer(String fName, String lName, String pCode) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until addCustomer tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(addCustomerTab));
	        driver.findElement(addCustomerTab).click();
	        // Wait until customer details to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(firstName));
	        driver.findElement(firstName).sendKeys(fName);
	        driver.findElement(lastName).sendKeys(lName);
	        driver.findElement(postCode).sendKeys(pCode);
	        driver.findElement(addBtn).click();
	    }
	}

