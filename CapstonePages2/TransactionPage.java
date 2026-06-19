package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransactionPage {

	    static WebDriver driver;

	    private By transactionsTab = By.cssSelector("button[ng-click='transactions()']");
	    private By transactionsTable = By.cssSelector("table");

	    public TransactionPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openTransactions() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until transactions tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(transactionsTab));
	        driver.findElement(transactionsTab).click();
	    }

	    public boolean isTransactionsDisplayed() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until transactions tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(transactionsTable));
	        return driver.findElement(transactionsTable).isDisplayed();
	    }
	}
