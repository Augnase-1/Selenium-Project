package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guruu99 {
	ChromeDriver driver;	
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void rhtDble() 
	{
		Actions act=new Actions(driver);
		WebElement rgtclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	    act.contextClick(rgtclk);
	    act.perform();
	    WebElement cutclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]"));
		act.contextClick(cutclk);
		act.perform();
		 
	    Alert a=driver.switchTo().alert();
	    a.accept();
	    WebElement dblclck=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	    act.doubleClick(dblclck);
	    act.perform();
	    a.accept();
	}
	}	

