package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@Test
	public void amazontit()
	{
		String window=driver.getWindowHandle();
	    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	    String actualTitle=driver.getTitle();
	  System.out.println("Title="+actualTitle);
	  String expectedTitle="Amazon.in:mobile phones";
	  if (actualTitle.equalsIgnoreCase(expectedTitle))
	  {
	  	System.out.println("same");
	  }
	  else
	  {
	  	System.out.println("not same");

	  }
	  JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		
driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();

Set<String> allWindows=driver.getWindowHandles();
for (String handle:allWindows) 
{
	if(!handle.equalsIgnoreCase(window)) {
	driver.switchTo().window(handle);
	driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	driver.close();
	}
}
driver.switchTo().window(window);
		}
	}
