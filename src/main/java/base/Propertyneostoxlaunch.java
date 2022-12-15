package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilitymaven.Generalmethods;
import utilitymaven.Propertyfilestudy;





public class Propertyneostoxlaunch 
{
	
	
	
	protected static  WebDriver driver;
	public void launchapp() throws IOException
	{
		
		//launch browser by using property file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\chrome1\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(Propertyfilestudy.readdatafrompropertyfile("url"));
		//Reporter.log("launching browser",true);
		
		Generalmethods.wait(driver, 3000);
	}
}
