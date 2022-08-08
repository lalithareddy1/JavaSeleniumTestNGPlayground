package TestNgDemo;

import org.testng.annotations.Test;

public class DependsOnExample {
	
	
	@Test
	public void searchproducts() {
		System.out.println("Searching Products");
		
	}
	@Test(dependsOnMethods = "searchproducts")
	public void selectproduct() {
		System.out.println("Selecting Product");
		
	}
	
	@Test(dependsOnMethods = "selectproduct")
	public void addToCart() {
		
		System.out.println("Add to cart");
	}

}
