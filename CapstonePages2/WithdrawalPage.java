package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithdrawalPage {

	    static WebDriver driver;

	    private By withdrawalTab = By.cssSelector("button[ng-click='withdrawl()']");
	    private By amountInput = By.cssSelector("input[ng-model='amount']");
	    private By withdrawBtn = By.cssSelector("button[type='submit']");
	    private By message = By.cssSelector(".error");

	    public WithdrawalPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void withdrawAmount(String amount) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until Withdrawal tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(withdrawalTab));
	        driver.findElement(withdrawalTab).click();
	        // Wait until amountInput field to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(amountInput));
	        driver.findElement(amountInput).sendKeys(amount);
	        driver.findElement(withdrawBtn).click();
	    }

	    public String getMessage() {
	        return driver.findElement(message).getText();
	    }
	}

