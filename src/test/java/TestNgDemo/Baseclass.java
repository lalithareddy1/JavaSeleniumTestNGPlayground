package TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeSuite
	public void before_suite() {
		System.out.println("Before Suite execute before all the tests in the suite");
	}

	@BeforeTest
	public void before_test() {
		System.out.println("Before Test executes before every test in the suite");
	}

	@BeforeGroups(groups = {"regression", "smoke", "sanity"})
	public void before_group() {
		System.out.println("Before groups");

	}

	@BeforeClass
	public void before_class() {

		System.out.println("Before class executes before class starts");
	}

	@BeforeMethod
	public void before_method() {
		System.out.println("Before Method executes before each and every test method");
	}

	@AfterMethod
	public void after_method() {
		System.out.println("After Method executes after each and every test method");
	}

	@AfterClass
	public void after_class() {

		System.out.println("After Class executes after class");
	}

	@AfterGroups(groups = {"regression", "smoke", "sanity"})
	public void after_group() {
		System.out.println("Before groups");

	}

	@AfterTest
	public void after_test() {
		System.out.println("AfterTest executes after every test in the suite ");
	}

	@AfterSuite
	public void after_suite() {
		System.out.println("After Suite execute after all the tests in the suite");
	}

}
