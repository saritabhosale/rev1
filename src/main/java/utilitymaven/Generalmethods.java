package utilitymaven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class Generalmethods 
{
	public static String  readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		
		File myfile=new File("C:\\Users\\Shree\\Desktop\\excel\\book2.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		//Reporter.log("read data from excell"+value,true);
		return value;
		
	}
public static void scrolling(WebDriver driver,WebElement element)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element );
	//Reporter.log("scrolling takes place",true);
}
public static void takescreenshot(WebDriver driver,String myshot) throws IOException
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File destination=new File("\"D:\\\\screenshot\"+myshot+\".jpeg\"");
	
	File destination=new File("D:\\screenshot"+myshot+".jpeg");
	FileHandler.copy(source, destination);
	//Reporter.log("screenshot takes place",true);
}
public static void wait(WebDriver driver,int time)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	//Reporter.log("waiting takes place",true);
	}
}
