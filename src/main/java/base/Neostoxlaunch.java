package base;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import utilitymaven.Generalmethods;



public class Neostoxlaunch 
{
protected static WebDriver driver;
public void launchapp()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\chrome1\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://neostox.com/");
	//Reporter.log("launching browser",true);
	Generalmethods.wait(driver, 3000);
}

}
