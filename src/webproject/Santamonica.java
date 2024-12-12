package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santamonica {
	ChromeDriver driver;
	@Before
	public  void setUp()
	  {
		   driver=new ChromeDriver();
		  driver.get("https://www.santamonicaedu.in/");
	  }

@Test

public void setip()
{
String title=driver.getTitle();
String expected="santamonic";
if(title.equalsIgnoreCase(expected))
{
	System.out.println("same");
}
else
{
	System.out.println("not same");
String pagesource=driver.getPageSource();
String exSource="STUDY ABROAD";
if(pagesource.contains(exSource))
{
	System.out.println("contains");
}
else
{
	System.out.println(" not contains");
}
driver.manage().window().maximize();
}
driver.findElement(By.xpath("//*[@id='menu-item-567']/a")).click();
driver.findElement(By.xpath("//*[@name='cname']")).sendKeys("Augnase");
driver.findElement(By.xpath("//*[@name='cemail']")).sendKeys("augnasegeorge@gmail.com");
driver.findElement(By.xpath("//*[@name='cphone']")).sendKeys("7034429783");
driver.findElement(By.xpath("//*[@name='ccountry']")).sendKeys("Newzealand");
driver.findElement(By.xpath("//*[@name='ccourse']")).sendKeys("Mtech");
driver.findElement(By.xpath("//*[@class='site-main sidebar cmt-sidebar-right rightSideBar']/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/a")).click();
}
}
