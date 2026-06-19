package CapstoneTest2;

import org.testng.Assert;
import org.testng.annotations.Test;

import CapstonePages2.AddCustomerPage;
import CapstonePages2.BaseTest;
import CapstonePages2.CustomerPage;
import CapstonePages2.ManagerLoginPage;
import CapstonePages2.OpenAccountPage;

public class ManagerTest extends BaseTest {

	    @Test (priority = 0)
	    public void testManagerLogin() {
	        initializeDriver();
	        ManagerLoginPage managerPage = new ManagerLoginPage(driver);
	        managerPage.loginAsManager();
	        Assert.assertTrue(managerPage.isAddCustomerVisible(), "Manager logged in successfully!");
	        closeDriver();
	    }

	    @Test (priority = 1)
	    public void testAddCustomerPositive() {
	        initializeDriver();
	        ManagerLoginPage managerPage = new ManagerLoginPage(driver);
	        managerPage.loginAsManager();

	        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
	        addCustomerPage.addCustomer("John", "Doe", "12345");

	        // Handle alert confirmation
	        String alertText = driver.switchTo().alert().getText();
	        //System.out.println(alertText);
	        Assert.assertTrue(alertText.contains("Customer added successfully"), "Customer is successfully added!");
	        driver.switchTo().alert().accept();
	        closeDriver();
	    }

	    @Test(priority = 2)
	    public void testOpenAccountPositive() {
	        initializeDriver();
	        ManagerLoginPage managerPage = new ManagerLoginPage(driver);
	        managerPage.loginAsManager();

	        OpenAccountPage openAccountPage = new OpenAccountPage(driver);
	        openAccountPage.openAccount("Ron Weasly", "Dollar");

	        String alertText = driver.switchTo().alert().getText();
	        Assert.assertTrue(alertText.contains("Account created successfully"), "Account is successfully created!");
	        driver.switchTo().alert().accept();
	        closeDriver();
	    }

	    @Test(priority = 3)
	    public void testViewCustomers() {
	        initializeDriver();
	        ManagerLoginPage managerPage = new ManagerLoginPage(driver);
	        managerPage.loginAsManager();

	        CustomerPage customersPage = new CustomerPage(driver);
	        customersPage.viewCustomers();
	        customersPage.searchCustomer("Neville");

	        // Verify search works (basic check: page source contains name)
	       // System.out.println(driver.getPageSource());
	        Assert.assertTrue(driver.getPageSource().contains("Neville"), "Customer found!");
	        closeDriver();
	    }
	}
