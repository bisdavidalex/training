package Testing;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DealingwithTextfiles {
	
	//@Test
	public void createnewfile() throws IOException
	{
		File f = new File("C:\\File\\testfile.txt");
		
		f.createNewFile();
		
	}
	
	
	//@Test
	public void writeintofile() throws IOException
	{
		FileWriter writer = new FileWriter("C:\\File\\testfile.txt");
		BufferedWriter actualwriter = new BufferedWriter(writer); 
		
		actualwriter.write("London,Birmingham");
		
		actualwriter.flush();	
		
		
	}
	
	@Test
	public void readfromfile() throws IOException
	{
		
		Properties prop = new Properties(); 
		FileInputStream reader = new FileInputStream(System.getProperty("user.dir")+"\\src\\Config\\config.properties");
				
		prop.load(reader);
		
		FileReader reader1 = new FileReader(prop.getProperty("textfile"));
		BufferedReader actualreader = new BufferedReader(reader1); 
		
		String i; 
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("URL"));
		
		while((i=actualreader.readLine())!=null)
		{
		
		System.out.println(i);
		
		String[] parts = i.split(",");
		
		String origin = parts[0]; // 004
		String destination = parts[1]; // 034556
			
		driver.findElementById("originStation").clear();
		driver.findElementById("destinationStation").clear();
		
		driver.findElementById("originStation").sendKeys(origin);
		driver.findElementById("destinationStation").sendKeys(destination);
	
		}
		
		
		
		
	}

}
