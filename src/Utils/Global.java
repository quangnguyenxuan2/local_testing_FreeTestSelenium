package Utils;

import org.openqa.selenium.WebDriver;

public class Global {

	public static WebDriver Driver;
	public static String URL = "http://www.phptravels.net/login";
	
	public Global(WebDriver driver){
		this.Driver = driver;
	}
}
