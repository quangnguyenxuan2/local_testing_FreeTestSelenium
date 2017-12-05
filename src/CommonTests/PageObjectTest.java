package CommonTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Object.HomePage;
import Utils.Common;
import Utils.Global;

public class PageObjectTest {

	public WebDriver Driver;
	public Common common;
	public HomePage homePage;
	
	@BeforeMethod
	public void Set_Up(){
		Driver = new FirefoxDriver();
		Driver.navigate().to(Global.URL);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homePage = new HomePage(Driver);
	}
	
	@Test
	public void Test() throws InterruptedException{
		homePage.EnterUsername("email@gmail.com");
		Thread.sleep(3000);
		homePage.EnterPassword("password");
		Thread.sleep(3000);
		homePage.ClickButtonLogin();
	}
	
	@AfterMethod
	public void End_Test(){
		Driver.quit();
	}
}
