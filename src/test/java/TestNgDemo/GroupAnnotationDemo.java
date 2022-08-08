package TestNgDemo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class GroupAnnotationDemo {

	@Test(groups = { "smoketest", "sanitytest" })
	public void testmethod1() {
		System.out.println("Smoke and Sanity Testig");
	}

	@Test(groups = { "smoketest" })
	public void testmethod2() {
		System.out.println("Smoke Testing");

	}

	@Test(groups = { "sanitytest" })
	public void testmethod3() {
		System.out.println("Sanity testing");
	}

	@Test(groups = { "regression" })
	public void testmethod4() {
		System.out.println("Regression Testing");
	}

	@Test()
	public void testmethod5() {
		System.out.println("Method 5");

	}

	@Test(groups = { "windows.checkintest" })
	public void testWindowsOnly() {
		System.out.println("Windows method");
	}

}
