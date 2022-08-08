package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test(priority = 1)
	public void launching_browser(String browser) {
		System.out.println("Browser Name :" + browser);
		if(browser == "Chrome") {
			
			System.out.println("Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		}
		else if(browser == "Firefox") {
			System.out.println(" Firefox Browser");
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList#");
		
		
	}
	
	@Parameters({"username", "password"})
	@Test(priority = 2)
	public void login_test(String username, String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

		
		
	}
	
	

}
