package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaLinks {
	ChromeDriver driver;
	@Before
	public  void setUp()
	  {
		   driver=new ChromeDriver();
		  driver.get("https://www.santamonicaedu.in/");
	  }
@Test
public void setup() {
List<WebElement>Linkdetails=driver.findElements(By.tagName("a"));
for (WebElement element : Linkdetails)
{
    String link = element.getAttribute("href");
    Verify(link);
}
}
    
private void Verify(String link) {
	try
	{
		URL u=new URL(link);
		HttpURLConnection code=(HttpURLConnection)u.openConnection();
		
		if (code.getResponseCode()==404)
		{
			System.out.println("brokenlinks:"+link);
		}
		
		else
		{
			System.out.println("Other response code:" +link);
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
}
}


