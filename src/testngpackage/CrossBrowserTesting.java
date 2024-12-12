package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	
		public void setup(String browser)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();
			}
				else if(browser.equalsIgnoreCase("Edge"))
			{
				driver=new EdgeDriver();
			}
				else
				{
					driver=new FirefoxDriver();
				}
		}
@Test
public void verifyTitle() {
    driver.get("https://www.flipkart.com/");
    String actualTitle = driver.getTitle();
   System.out.println(actualTitle);

}
}
