package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}

@Test
public void copypaste()
{
	Actions act=new Actions(driver);
WebElement fullname=driver.findElement(By.xpath("//*[contains(@name,'name')]"));
fullname.sendKeys("Augnase");
WebElement chooseId=driver.findElement(By.xpath("//*[contains(@name,'login')]"));

act.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
act.keyDown(fullname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
act.keyDown(chooseId, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
act.perform();
}
}