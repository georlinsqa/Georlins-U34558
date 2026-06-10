package SeleniumWebDriver;

import org.testng.annotations.Test;

public class TestcaseGrouping {

	@Test(groups = {"Smoke"})
	public void test1() {
		
		System.out.println("This is test1");
		
	}
	
	@Test(groups = {"Smoke"})
	public void test2() {
		
		System.out.println("This is test2");
		
	}
	
	@Test(groups = {"Regression", "Smoke"})
	public void test3() {
		
		System.out.println("This is test3");
		
	}

	@Test(groups = {"Regression"})
	public void test4() {
		
		System.out.println("This is test4");
		
	}
	
}
