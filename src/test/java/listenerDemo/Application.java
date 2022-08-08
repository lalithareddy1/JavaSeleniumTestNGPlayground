package listenerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Application extends BaseClass {
	public SoftAssert softassert;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		driver.manage().window().maximize();

	}

	@Test
	public void login_test() throws InterruptedException {
		driver.findElement(By.id("useremail")).sendKeys("lalitha517.sudireddy@gmail.com");
		driver.findElement(By.id("userpass")).sendKeys("Frenchstreet");
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(1000);
		
		String expected_title = "Rediff Moneywiz | My Portfolio(s)";
		String actual_title = driver.getTitle();
		System.out.println("Title of the page is :" + actual_title);
		
		softassert.assertEquals(actual_title, expected_title);
		softassert.assertAll();
		
        Reporter.log("The website used was DemoQA for this test", true);


	}

	@Test
	public void home_test() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class=\"ul_top_tabs\"]/li/a[contains(text(), 'Home')]")).click();
		String title = driver.getTitle();
		System.out.println("Title After clicking Home " + title);
		// softassert.assert
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
