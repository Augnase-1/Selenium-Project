package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagesourcePgm {
	ChromeDriver driver;
	@Before
	public  void setUp()
	  {
		   driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
	  }

	@Test
	  public void Pagesource() 
	  {
		 String page=driver.getPageSource();
		 if(page.contains("Gmail"))
		 {
             System.out.println("present");
		 }
		 else
		 {
			 System.out.println("not present");
		 }
	  }

@After

public void tearDown()
{
	driver.quit();
}
}


