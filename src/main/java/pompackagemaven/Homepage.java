package pompackagemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitymaven.Generalmethods;




public class Homepage
{
@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okbutton;
@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closebutton;
@FindBy(xpath="//span[@id='lbl_username']") private WebElement username;
@FindBy(xpath="//span[text()='Logout']") private WebElement logout ;
@FindBy(xpath="//span[@id='lbl_curbalancetop']") private WebElement avilablebalance ;

public Homepage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
	
}
public void popuphandeling(WebDriver driver)
{
	if(okbutton.isDisplayed())
	{
	Generalmethods.wait(driver, 20000);
	okbutton.click();
	//Reporter.log("ok button clicked",true);
	Generalmethods.wait(driver, 5000);
	
	closebutton.click();
	//Reporter.log("close button clicked",true);
	}
	
	else
	{
		Generalmethods.wait(driver, 3000);
		//Reporter.log("pop up not present",true);
		
	}
	}
public String getactualusername()
{
	String actualusername = username.getText();
	//Reporter.log("getting actual username",true);
	return actualusername;
	}
public void logout(WebDriver driver)
{
	username.click();
	//Reporter.log("click on username ",true);
	Generalmethods.wait(driver, 5000);
	logout.click();
	
}
public String getavilablebalance() 
{
	String accountbalance = avilablebalance.getText();
//	Reporter.log("my balance is"+accountbalance,true);
	return accountbalance;
}
}
