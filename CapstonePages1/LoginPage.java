package CapstonePages1;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	    private By emailField = By.id("Email");
	    private By passwordField = By.id("Password");
	    private By loginButton = By.cssSelector("input[value='Log in']");

	    public void login(String email, String password) {
	        type(emailField, email);
	        type(passwordField, password);
	        click(loginButton);
	    }
}
