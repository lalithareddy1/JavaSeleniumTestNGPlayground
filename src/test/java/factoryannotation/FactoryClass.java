package factoryannotation;

import org.testng.annotations.Factory;


/*@DataProvider gives you the power to run a test method with different sets of data, and 
  @Factory gives you the power to run all methods inside a test class with different sets of data.
 * */
public class FactoryClass {
	
	
	@Factory
	public Object[] test() {
		
		Object[] data = new Object[3];
		data[0] = new TestFactory("HP", 8);
		data[1] = new TestFactory("Lenvo", 8);
		data[2] = new TestFactory("Asus", 6);
		
		return data;
	}

}
