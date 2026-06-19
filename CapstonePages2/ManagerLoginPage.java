package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerLoginPage {

	    static WebDriver driver;

	    private By managerLoginBtn = By.cssSelector("button[ng-click='manager()']");
	    private By addCustomerBtn = By.cssSelector("button[ng-click='addCust()']");

	    public ManagerLoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void loginAsManager() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until manager login button to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(managerLoginBtn));
	        driver.findElement(managerLoginBtn).click();
	    }

	    public boolean isAddCustomerVisible() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until add customer button to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(addCustomerBtn));
	        return driver.findElement(addCustomerBtn).isDisplayed();
	    }
	}

