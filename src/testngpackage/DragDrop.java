package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
	ChromeDriver driver;	
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void dragndDrop()
	{
		Actions act=new Actions(driver);
WebElement amntsrc=driver.findElement(By.xpath("//*[@id='fourth']/a"));
WebElement bankk=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
WebElement amountdst=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
WebElement bankdes=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
act.dragAndDrop(amntsrc, amountdst);
act.dragAndDrop(bankk, bankdes);
act.perform();	
}
	
}

