package pompackagemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginneostox
{
@FindBy(xpath="//input[@id='MainContent_signinsignup_txt_mobilenumber']") private WebElement mobilenumber;
@FindBy(xpath="(//a[text()='Sign Up'])[2]")	private WebElement signupbutton;

public Loginneostox(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void entermobilenumber(String mno)
{
	mobilenumber.sendKeys(mno);
}
public void clicksignupbutton()
{
	signupbutton.click();
}
}
