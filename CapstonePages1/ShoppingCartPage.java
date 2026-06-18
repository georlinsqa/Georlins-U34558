package CapstonePages1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage {
	    private By addToCartButton = By.xpath("//input[@id='add-to-cart-button-5']");
	    private By cartQty = By.xpath("//span[normalize-space()='Shopping cart']");

	    public void addItemToCart() {
	        click(addToCartButton);
	    }

	    public String getCartQuantity() {
	    	click(cartQty);
	    	
	    	//Checking whether the cart is empty
	          WebElement sc = driver.findElement(By.cssSelector("a.ico-cart span.cart-qty"));
	            if (sc.getText().contains("Your Shopping Cart is empty!")) {
	             return ("empty");
	    }
	            else
	            {
	            	return("full");
	            }
	}
	}

