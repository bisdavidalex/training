package Testing;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class testheadless {

	@Test
	public void testfirefox() // 79
	{

		FirefoxDriver driver = new FirefoxDriver(); 
		//long starttime = System.currentTimeMillis();
		StopWatch s =new StopWatch();
		
		s.start();
		
		driver.get("http://www.thetrainline.com");
		//long endtime = System.currentTimeMillis();
		
		s.stop();
		
		System.out.println(s.getTime());
		//System.out.println((endtime-starttime)/1000+" secs");

	}
	
	//@Test
	public void testhtmunit() // 2 sec
	{
		HtmlUnitDriver driver = new HtmlUnitDriver(); 
		driver.get("http://www.thetrainline.com");
		
	}
	
	//@Test 
	public void testphantomjs() // 15 secs
	{
		System.setProperty("phantomjs.binary.path", "C:\\Automation\\phantomjs.exe"); 
		PhantomJSDriver driver = new PhantomJSDriver(); 
		
		driver.get("http://www.thetrainline.com");
		
		
		
		
	}
}
