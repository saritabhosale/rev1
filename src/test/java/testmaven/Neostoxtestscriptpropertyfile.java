package testmaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Propertyneostoxlaunch;
import pompackagemaven.Homepage;
import pompackagemaven.Loginneostox;
import pompackagemaven.Psscodepage;
import utilitymaven.Generalmethods;
import utilitymaven.Propertyfilestudy;








public class Neostoxtestscriptpropertyfile extends Propertyneostoxlaunch
{
  
  Loginneostox login;
	Psscodepage pass;
	Homepage home;
@Test
public void validateusername() throws EncryptedDocumentException, IOException 
{
	  Assert.assertEquals(home.getactualusername(),Propertyfilestudy.readdatafrompropertyfile("username"),"tc fail as both not equals");
	  Reporter.log("tc pass username is successfully validated",true);
	  Generalmethods.takescreenshot(driver, home.getactualusername());
	  home.getavilablebalance();
}
@Test
public void validateavilablebalance()
{
	home.getavilablebalance();
	
}
@BeforeMethod
public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException 
{
	 login.entermobilenumber(Propertyfilestudy.readdatafrompropertyfile("mobilenumber")); 
	 login.clicksignupbutton();
	 pass.enterpasscode(Propertyfilestudy.readdatafrompropertyfile("password"));
	 Thread.sleep(5000);
	 pass.clicksubmitbutton(driver);
	 Thread.sleep(1000);
	 
	 home.popuphandeling(driver);
	 
}

@AfterMethod
public void afterMethod() 
{
	  home.logout(driver);
	  Reporter.log("logout from application");
}

@BeforeClass
public void beforeClass() throws IOException 
{
	 launchapp() ;
	 login=new Loginneostox(driver);
	 pass=new Psscodepage(driver);
	 home=new Homepage(driver);
}

@AfterClass
public void afterClass() 
{
}
  
  
}
