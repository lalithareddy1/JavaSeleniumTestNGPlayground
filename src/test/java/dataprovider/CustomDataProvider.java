package dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	
	@DataProvider(name="Student")
	public Object[][] getData(){
		
		//Object[][] data = {{"employee1@gmail.com", "India"}, {"employee2@gmail.com", "USA"}, {"employee3@gmail.com", "USA"}}; 
		
		Object[][] data = new Object[3][2];
		data[0][0] = "John";
		data[0][1] = "USA";
		
		data[1][0] = "Alex";
		data[1][1] = "USA";
		
		data[2][0] = "Ray";
		data[2][1] = "UK";
		
		
		return data;
		
		
		
	}


}
