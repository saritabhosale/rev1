package utilitymaven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public class Propertyfilestudy
{
public static String readdatafrompropertyfile(String key) throws IOException
{
	//create object of properties class
	Properties pro=new Properties();
	//create object of fileinputstream class
	FileInputStream myfile= new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\bankingshare\\myshare.properties");
	pro.load(myfile);
	
	String value = pro.getProperty(key);
	//Reporter.log("read value of  "+key+"from property fie ");
	return value;
}
}
