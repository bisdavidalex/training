package Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Testproperties {

	public WebDriver driver;
	
	@Test
	public void testproperty() throws IOException
	{
		 
		
		// Create a propeties object 
		
		Properties prop = new Properties(); 
				
		// load that properties file
		
		FileInputStream reader = new FileInputStream(System.getProperty("user.dir")+"\\src\\Config\\config.properties");
				
		prop.load(reader);
		
		// call the value of property
		
		System.out.println(prop.getProperty("BROWSER"));
	
		System.out.println(System.getProperty("user.dir"));
		
		if(prop.getProperty("BROWSER").equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();  
			
		}
		
		if(prop.getProperty("BROWSER").equalsIgnoreCase("HtmlUnit"))
		{
			driver = new HtmlUnitDriver();					 
			
		}
		
		driver.get(prop.getProperty("URL"));
	}
	
}
