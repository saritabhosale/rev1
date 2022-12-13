package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilitymaven.Generalmethods;

public class Amazonlaunch 
{
protected static WebDriver driver;
public void launchamazon()
{
	System.setProperty("webdriver.chome.driver", "C:\\Users\\Shree\\Desktop\\chrome1");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=2413097069237605778&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050526&hvtargid=kwd-296458795081&hydadcr=14452_2154371&gclid=Cj0KCQiAyracBhDoARIsACGFcS7xv2UbxlOC6Gwg3wAtKccmpc5CGr1u8ue7XbHgS8qP0dJlmBELkCgaAnwnEALw_wcB");
Generalmethods.wait(driver, 5000);
}
}
