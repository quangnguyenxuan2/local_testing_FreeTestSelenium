package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Common;
import Utils.Global;

public class HomePage {

	private WebDriver driver;
	private Common common;
	public static By txt_username = By.name("username");
	public static By txt_password = By.name("password");
	public static By btn_login = By.className("btn btn-action btn-block loginbtn");
	
	public HomePage(WebDriver _driver){
		this.driver = _driver;
		common = new Common(_driver);
	}
	
	public void EnterUsername(String username){
		WebElement elm_username = common.CaptureElement(txt_username);
		elm_username.sendKeys(username);
	}
	
	public void EnterPassword(String password){
		WebElement elm_password = common.CaptureElement(txt_password);
		elm_password.sendKeys(password);
	}
	
	public void ClickButtonLogin(){
		WebElement elm_login = common.CaptureElement(btn_login);
		elm_login.click();
	}
}
