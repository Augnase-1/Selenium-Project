package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	@Before
	public  void setUp()
	  {
		   driver=new ChromeDriver();
		  driver.get("https://www.ebay.com/");
	  }


@Test
public void setup()
{	
	String exp="ebay.com";
	String actualTitle=driver.getTitle();
   if (actualTitle.equalsIgnoreCase(exp))
	  {
	  	System.out.println("same");
	  }
	  else
	  {
	  	System.out.println("not same");
	  }
	  
driver.findElement(By.id("gh-shop-a")).click();

String page=driver.getPageSource();
if(page.contains("Shop by category"))
{
System.out.println("present");
}
else
{
	System.out.println("not present");  
}
driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Art/550/bn_1853728']")).click();
driver.findElement(By.xpath("//img[@src='https://i.ebayimg.com/thumbs/images/g/9coAAOSwCyZiYiY8/s-l225.webp']")).click();   
driver.findElement(By.xpath("//a[@href='https://cart.payments.ebay.com/sc/view']")).click();
driver.findElement(By.name("_nkw")).sendKeys("Books",Keys.ENTER);
}
}