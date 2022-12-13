package testmaven;

import org.testng.annotations.Test;

import base.Neostoxlaunch;
import pompackagemaven.Homepage;
import pompackagemaven.Loginneostox;
import pompackagemaven.Psscodepage;
import utilitymaven.Generalmethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Neostoxtestcsript extends Neostoxlaunch
{
	Loginneostox login;
	Psscodepage pass;
	Homepage home;
  @Test
  public void validateusername() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getactualusername(), Generalmethods.readdatafromexcel(1, 2),"tc fail as both not equals");
	  Reporter.log("tc pass username is successfully validated",true);
	  Generalmethods.takescreenshot(driver, home.getactualusername());
	  home.getavilablebalance();
  }
  @BeforeMethod
  public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	 login.entermobilenumber(Generalmethods.readdatafromexcel(1, 0)); 
	 login.clicksignupbutton();
	 pass.enterpasscode(Generalmethods.readdatafromexcel(1, 1));
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
  public void beforeClass() 
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
