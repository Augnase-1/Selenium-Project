package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResonseCodeAmzn {
	ChromeDriver driver;
	@Before
	public  void setUp()
	  {
		   driver=new ChromeDriver();
		  driver.get("https://www.ebay.com/");
	  }
	@Test
	public void linkCountFb()
	{
	List<WebElement>Linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("Total no. of links="+Linkdetails.size());
	
	for (WebElement element : Linkdetails) {
        String link = element.getAttribute("href");
        Verify(link);
	}
	}
        
	private void Verify(String link) {
		try
    	{
    		URL u=new URL(link);
    		HttpURLConnection code=(HttpURLConnection)u.openConnection();
    		
    		if (code.getResponseCode()==200)
    		{
    			System.out.println("Resonse code is 200--------"+link);
    		}
    		else if(code.getResponseCode()==404)
    		{
    			System.out.println("Response code is 404---------"+link);
    		}
    		else
    		{
    			System.out.println("Other response code");
    		}
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    	
		
	}
}
