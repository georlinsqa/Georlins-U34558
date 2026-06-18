package CapstoneTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CapstonePages1.BasePage;
import CapstonePages1.WishlistPage;


public class WishlistTest {

	private WebDriver driver;

	    @Test
	    public void testAddItemToWishlist() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/50s-rockabilly-polka-dot-top-jr-plus-size");
	        BasePage.setDriver(driver);

	        WishlistPage wishlistPage = new WishlistPage();
	        
	      //Adding an item to the wishlist and verifying that the item is successfully added to the wishlist - positive scenario
	        wishlistPage.addItemToWishlist();
	        String s = wishlistPage.getWishlistQuantity();
	        System.out.println(wishlistPage.getWishlistQuantity());
	        Assert.assertTrue(wishlistPage.getWishlistQuantity().contains("full"), "Item added!");

	        driver.quit();
	    }

	    @Test
	    public void testAddItemWithoutLogin() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/50s-rockabilly-polka-dot-top-jr-plus-size");
	        BasePage.setDriver(driver);
	        WishlistPage wishlistPage = new WishlistPage();
	        
	      //Adding an item to the wishlist without logging in and verifying that the item is not added to the wishlist - negative scenario
	        wishlistPage.addItemToWishlist();
	        Assert.assertTrue(wishlistPage.getWishlistQuantity().contains("empty"), "Wishlist should be empty without login!");
			
	        driver.quit();
	    }
	}
