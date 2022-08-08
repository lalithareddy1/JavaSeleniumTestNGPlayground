package TestNgDemo;

import org.testng.annotations.Test;

public class AnnotationsDemo2 extends Baseclass {

	@Test(groups = {"regression", "smoke", "sanity"})
	public void test3() {
		System.out.println("Executing Test3 in Demo2");
	}

	@Test(groups = {"smoke", "sanity"})
	public void test4() {
		System.out.println("Executing Test4 in Demo2");
	}

}
