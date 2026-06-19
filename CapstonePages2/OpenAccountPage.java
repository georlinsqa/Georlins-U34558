package CapstonePages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenAccountPage {

	    static WebDriver driver;

	    private By openAccountTab = By.cssSelector("button[ng-click='openAccount()']");
	    private By customerDropdown = By.id("userSelect");
	    private By currencyDropdown = By.id("currency");
	    private By processBtn = By.cssSelector("button[type='submit']");

	    public OpenAccountPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openAccount(String customerName, String currency) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        // Wait until openaccount tab to be visible
	        wait.until(ExpectedConditions.elementToBeClickable(openAccountTab));
	        driver.findElement(openAccountTab).click();
	        wait.until(ExpectedConditions.elementToBeClickable(customerDropdown));
	        new Select(driver.findElement(customerDropdown)).selectByVisibleText(customerName);
	        new Select(driver.findElement(currencyDropdown)).selectByVisibleText(currency);
	        driver.findElement(processBtn).click();
	    }
	}

