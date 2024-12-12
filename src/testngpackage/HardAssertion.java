package testngpackage;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
	ChromeDriver driver;
	  @BeforeTest
	  public  void setUp()
	  {
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
	  }
	  @Test
	  public void titleVerification() 
	  {
		  String actualTitle=driver.getTitle();
		  String expectedTitle="oogle";
		  Assert.assertEquals(actualTitle,expectedTitle);
		  System.out.println("hello");
}
}