package TestNgDemo;

import org.testng.annotations.Test;

/*
@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
@BeforeMethod: The annotated method will be run before each and every test method.
@AfterMethod: The annotated method will be run after each and every test method.
Run from TestNg
@BeforeSuite: The annotated method will be run before all tests in this suite have run.
@AfterSuite: The annotated method will be run after all tests in this suite have run.
@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
*/

public class AnnotationsDemo1 extends Baseclass {

	@Test(groups = {"regression", "smoke"})
	public void test1() {
		System.out.println("Executing Test1 in Demo1");
	}

	@Test(groups = {"sanity"})
	public void test2() {
		System.out.println("Executing Test2 in Demo1");
	}

}
