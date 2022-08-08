package factoryannotation;

import org.testng.annotations.Test;

public class TestFactory {
	
	String laptop_name;
	int ram;
	
	public TestFactory(String laptop_name, int ram) {
		// TODO Auto-generated constructor stub
		this.laptop_name = laptop_name;
		this.ram = ram;
	}
	
	
	@Test
	public void method1() {
		
		System.out.println("Method 1" +" "+laptop_name +" "+ram);
	}
	
	@Test
	public void method2() {
		
		System.out.println("Method 2"+" "+laptop_name +" "+ram);
	}
	
	@Test
	public void method3() {
		
		System.out.println("Method 3"+" "+laptop_name +" "+ram);
	}

}
