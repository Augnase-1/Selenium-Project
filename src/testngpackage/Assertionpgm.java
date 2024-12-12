package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertionpgm {
	ChromeDriver driver;
	  @BeforeTest
	  public  void setUp()
	  {
		  driver=new ChromeDriver();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
	  }

	  @Test
	  public void title() 
	   
	  {
		  
	  String actualTitle="https://practicetestautomation.com/logged-in-successfully/";
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
String exp=driver.getCurrentUrl();
Assert.assertEquals(actualTitle, exp);
System.out.println("hello");
	  }
}
