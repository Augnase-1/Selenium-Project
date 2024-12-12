package webproject;

	import org.junit.Before;
	import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Html {
		
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/augna/Desktop/htmll.html");
		}
		
		
		@Test
		public void alertBox()
		{
			driver.findElement(By.xpath("//*[@value='Display alert box']")).click();
			Alert a=driver.switchTo().alert();
			String s=a.getText();
			System.out.println(s);
			a.accept();
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Augnase");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("George");
		}
	}