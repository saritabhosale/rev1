package pompackagemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitymaven.Generalmethods;

public class Amazonhome 
{
@FindBy(xpath="//a[text()=' Electronics ']")private WebElement electronicbutton;

public Amazonhome(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickonelectronicbutton(WebDriver driver)
{
	electronicbutton.click();
	Generalmethods.wait(driver, 5000);
	}
}
