package TestNgDemo;

import org.testng.annotations.Test;

public class PriorityExample {
	
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Executing Test One");
		
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("Executing Test Two");

	}
	@Test(priority = 3)
	public void test3() {
		System.out.println("Executing Test Three");

	}

}
