package dataprovider;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDataProvider {
	
	
	public WebDriver driver = null;
	
	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	@Test(dataProvider = "loginCredentials" )
	public void login(String username, String password) {
	
		System.out.println("Username is :" + username);
		System.out.println("Password is :" + password);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		

	}
	
	@AfterMethod
	public void close() {
		driver.quit();

	}
	
	
	@DataProvider(name = "loginCredentials")
	public Object[][] getData(){
		
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin1";
		data[1][1] = "admin1234";
		
		
		
		return data;
		
	}

}
