package pompackagemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitymaven.Generalmethods;






public class Psscodepage 
{
@FindBy(xpath="//input[@id='txt_accesspin']") private WebElement passcodefield;
@FindBy(xpath="//a[@id='lnk_submitaccesspin']") private WebElement submitbutton;
public Psscodepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public void enterpasscode(String pcd)	
{

	passcodefield.sendKeys(pcd);
	//Reporter.log("passcode is enetred",true);
}
public void clicksubmitbutton(WebDriver driver)
{
	Generalmethods.wait(driver, 3000);
	submitbutton.click();
	//Reporter.log("click on submit button",true);
	}
		
	

}
