package testngpackage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoIT {
		ChromeDriver driver;
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
		}
		@Test
		public void fileUp() throws AWTException, InterruptedException, IOException
		{
			driver.get("https://www.ilovepdf.com/word_to_pdf");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\augna\\Documents\\AutoITfolder\\t1.exe");
			Thread.sleep(3000);
		}
}
