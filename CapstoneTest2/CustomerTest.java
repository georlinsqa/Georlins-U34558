package CapstoneTest2;

import org.testng.Assert;
import org.testng.annotations.Test;

import CapstonePages2.BaseTest;
import CapstonePages2.CustomerLoginPage;
import CapstonePages2.DepositPage;
import CapstonePages2.TransactionPage;
import CapstonePages2.WithdrawalPage;

public class CustomerTest extends BaseTest {

	    @Test
	    public void testValidCustomerLogin() {
	        initializeDriver();
	        CustomerLoginPage customerPage = new CustomerLoginPage(driver);
	        customerPage.loginAsCustomer("Harry Potter");
	        Assert.assertTrue(customerPage.isLogoutDisplayed(), "Customer login failed!");
	        closeDriver();
	    }

	    @Test
	    public void testDepositPositive() {
	        initializeDriver();
	        CustomerLoginPage loginPage = new CustomerLoginPage(driver);
	        loginPage.loginAsCustomer("Harry Potter");

	        DepositPage depositPage = new DepositPage(driver);
	        depositPage.depositAmount("500");
	        Assert.assertTrue(depositPage.getMessage().contains("Deposit Successful"), "Deposit failed!");
	        closeDriver();
	    }

	    @Test
	    public void testWithdrawalNegative() {
	        initializeDriver();
	        CustomerLoginPage loginPage = new CustomerLoginPage(driver);
	        loginPage.loginAsCustomer("Harry Potter");

	        WithdrawalPage withdrawalPage = new WithdrawalPage(driver);
	        withdrawalPage.withdrawAmount("99999"); // Withdrawal amount is more than available balance
	        Assert.assertTrue(withdrawalPage.getMessage().contains("Transaction Failed"), "Withdrawal should fail!");
	        closeDriver();
	    }

	    @Test
	    public void testTransactionsVisible() {
	        initializeDriver();
	        CustomerLoginPage loginPage = new CustomerLoginPage(driver);
	        loginPage.loginAsCustomer("Harry Potter");

	        TransactionPage transactionsPage = new TransactionPage(driver);
	        transactionsPage.openTransactions();
	        Assert.assertTrue(transactionsPage.isTransactionsDisplayed(), "Transactions table not visible!");
	        closeDriver();
	    }
	}

