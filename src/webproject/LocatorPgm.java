package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPgm {
	 
		ChromeDriver driver;
		@Before
		public  void setUp()
		  {
			   driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
		  }
		@Test
		public void locator()
		{
			driver.findElement(By.name("email")).sendKeys("ABC");
			driver.findElement(By.id("pass")).sendKeys("123");
			driver.findElement(By.name("login")).click();
		}
}
