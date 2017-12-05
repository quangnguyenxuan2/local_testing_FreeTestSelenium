package CommonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Log;

import org.testng.Reporter;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;

public class SeleniumUnitTest {

	private static WebDriver Driver;
		
	@BeforeMethod
	public void Set_Up(){

		//DOMConfigurator.configure("C:/Users/quangnguyenx1/workspace/JUnitTestSelenium/src/log4j.xml");
		BasicConfigurator.configure();		
		Driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Impilicitly wait applied on system 10s");
	}
	
	@AfterMethod
	public void After_Method(){
		Driver.quit();
		Log.info("Browser closed");
		Reporter.log("==========CLOSED========");
	}
	
	@Test (dependsOnMethods = {"PreCondition_All_Test"})
	public void Case_01_Check_Function_Write_Logger() throws InterruptedException{

		Driver.get("https://www.google.com/");
		Log.info("----01 Web application launched ----");	
		Driver.findElement(By.id("lst-ib")).sendKeys("hello");
		Thread.sleep(5000);
	}
	
	@Test (dependsOnMethods = {"Case_01_Check_Function_Write_Logger"})
	public void Case_02_Check_Function_Write_Logger() throws InterruptedException{

		Driver.get("https://www.google.com/");
		Log.info("----02 Web application launched ----");	
		Driver.findElement(By.id("lst-ib")).sendKeys("automation selenium c#");
		Thread.sleep(5000);
	}
	
	@Parameters({"parameter1","parameter2"})
	@Test
	public void Case_03_Check_Function_Write_Parameter(String parameter1, String parameter2) throws InterruptedException{
		if (parameter1 != null && parameter2 != null){
			System.out.println("Test input Parameter TestNG success");
			Log.info("Test input Parameter TestNG success");
		} 
		else{
			System.out.println("Test input Parameter TestNG NOT success");
			Log.info("Test input Parameter TestNG NOT success");
		}
	}
	
	@Test
	public void PreCondition_All_Test(){
		Log.info("This is pre-condition test");
	}

}
