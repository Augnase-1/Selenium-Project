package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chatgpt {
	ChromeDriver driver;
@Before
public void setup()
{
	   driver=new ChromeDriver();
	  driver.get("https://chatgpt.com/");
}
@Test
public void setchat()
{
	driver.findElement(By.xpath("//*[@id='prompt-textarea']")).sendKeys("selenium",Keys.ENTER);
	
	
	
}
}