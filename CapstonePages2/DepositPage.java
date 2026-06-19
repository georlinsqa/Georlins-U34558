package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepositPage {

	    static WebDriver driver;

	    private By depositTab = By.cssSelector("button[ng-click='deposit()']");
	    private By amountInput = By.cssSelector("input[ng-model='amount']");
	    private By depositBtn = By.cssSelector("button[type='submit']");
	    private By message = By.cssSelector(".error");

	    public DepositPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void depositAmount(String amount) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until Deposit tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(depositTab));
	        driver.findElement(depositTab).click();
	        // Wait until amountInput field to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(amountInput));
	        driver.findElement(amountInput).sendKeys(amount);
	        driver.findElement(depositBtn).click();
	    }

	    public String getMessage() {
	        return driver.findElement(message).getText();
	    }
	}

