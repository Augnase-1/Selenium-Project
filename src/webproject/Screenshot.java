package webproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/augna/Desktop/htmll.html");
	}

	@Test
	public void screenshot() throws IOException
	{
		File C=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(C,new File("C:\\Users\\augna\\Documents\\screenshot\\imagescreen.png" ));
		
		WebElement button=driver.findElement(By.xpath("//*[@value='Display alert box']"));
		File buttonImage=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonImage,new File("./screenshott/buttonimage.png"));
	}
}