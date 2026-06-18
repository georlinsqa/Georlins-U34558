package CapstonePages1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishlistPage extends BasePage {
	    private By addToWishlistButton = By.xpath("//input[@id='add-to-wishlist-button-5']");
	    private By wishlistQty = By.xpath("//span[normalize-space()='Wishlist']");

	    public void addItemToWishlist() {
	        click(addToWishlistButton);
	    }

	    public String getWishlistQuantity() {
	    	click(wishlistQty);
	    	
	    	//Using List to get all the matching elements 
	          List<WebElement> wl = driver.findElements(By.cssSelector(".wishlist-content"));
	            if (!wl.isEmpty() && wl.get(0).getText().contains("The wishlist is empty")) {
	             return ("empty");
	    }
	            else
	            {
	            	return("full");
	            }
	}
}
