package CapstoneTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CapstonePages1.BasePage;
import CapstonePages1.ShoppingCartPage;

public class ShoppingCartTest {
	    private WebDriver driver;

	    @Test
	    public void testAddItemToCart() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/50s-rockabilly-polka-dot-top-jr-plus-size");
	        BasePage.setDriver(driver);
//Adding an item to the cart and verifying that the item is successfully added to the cart - positive scenario
	        ShoppingCartPage cartPage = new ShoppingCartPage();
	        cartPage.addItemToCart();
	        Assert.assertTrue(cartPage.getCartQuantity().contains("full"), "Item added!");

	        driver.quit();
	    }

	    @Test
	    public void testAddItemWithoutLogin() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/50s-rockabilly-polka-dot-top-jr-plus-size");
	        BasePage.setDriver(driver);
	      //Adding an item to the cart and verifying that the item is not added to the cart due to login issues - negative scenario
	        ShoppingCartPage cartPage = new ShoppingCartPage();
	        cartPage.addItemToCart();
	        Assert.assertTrue(cartPage.getCartQuantity().contains("empty"), "Cart should be empty without login!");

	        driver.quit();
	    }
	}

