package TestNgDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


/* If any method is set as alwaysRun=true, method always run even if dependsOnMethods fails
 */
public class AlwaysRunAnnotation {
	
	
	
	@Test
	public void searchproducts() {
		System.out.println("Searching Products");
        throw new RuntimeException();

		
	}
	@Test(alwaysRun = true, dependsOnMethods = "searchproducts")
	public void selectproduct() {
		System.out.println("Selecting Product");
		
	}
	
	@Test(dependsOnMethods = "selectproduct")
	public void addToCart() {
		
		System.out.println("Add to cart");
	}

}
