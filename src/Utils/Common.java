package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common {
	
	private WebDriver driver;
	
	public Common(WebDriver _driver){
		this.driver = _driver;
	}
	
	public WebElement CaptureElement(By locator){
		return driver.findElement(locator);
	}
	
	public void WaitToPageLoad(){
		
	}
}
