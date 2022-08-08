package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*DataProvider are used to test the testcase with multiple sets of data
 * */



public class DataProviderDemo {
	
	
	@Test(dataProvider = "EmployeeDetails")
	public void employeeDetails(String email, String country) {
		
		System.out.println("Email is :" + email);
		System.out.println("Country is :" + country);

		
	}
	
	
	@Test(dataProvider = "Student", dataProviderClass = CustomDataProvider.class)
	public void studentDetails(String email, String country) {
		
		System.out.println("Name is :" + email);
		System.out.println("Country is :" + country);

		
	}
	
	@DataProvider(name="EmployeeDetails")
	public Object[][] getData(){
		
		//Object[][] data = {{"employee1@gmail.com", "India"}, {"employee2@gmail.com", "USA"}, {"employee3@gmail.com", "USA"}}; 
		
		Object[][] data = new Object[3][2];
		data[0][0] = "employee1@gmail.com";
		data[0][1] = "India";
		
		data[1][0] = "employee2@gmail.com";
		data[1][1] = "USA";
		
		data[2][0] = "employee3@gmail.com";
		data[2][1] = "UK";
		
		
		return data;
		
		
	}
	
	
	@Test(dataProvider = "data1")
	public void test(String username, String password) {
		System.out.println("UserName is " + username);
		System.out.println("Password is " + password);
	}
	
	
	@DataProvider(name = "data1")
	public Object[][] createData(){
		return new Object[][] {
		{"admin", "admin123"},
		{"user", "user123"}
		
		};
		
	}

}
