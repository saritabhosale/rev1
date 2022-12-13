package testmaven;

import org.testng.annotations.Test;

import base.Amazonlaunch;
import pompackagemaven.Amazonhome;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Amazontest extends Amazonlaunch
{
	Amazonhome home;
  @Test
  public void f() 
  {
  }
  @BeforeMethod
  public void beforeMethod()
  {
  }

  @AfterMethod
  public void afterMethod() 
  {
  }

  @BeforeClass
  public void beforeClass() 
  {
	  launchamazon();
	  Reporter.log("launch application",true);
	  home=new Amazonhome(driver);
	  home.clickonelectronicbutton(driver);
	  Reporter.log("clicking on amazonbutton in application",true);
	  
  }

  @AfterClass
  public void afterClass()
  {
  }

}
