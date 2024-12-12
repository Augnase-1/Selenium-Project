package webproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListCountpg {
	ChromeDriver driver;
	@Before
	public  void setUp()
	  {
		   driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	  }
	@Test
	public void linkCountFb()
	{
	List<WebElement>Linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("Total no. of links="+Linkdetails.size());
	
	for (WebElement element : Linkdetails) {
        String link = element.getAttribute("href"); 
        String linkText = element.getText(); 
        System.out.println("Link: " + link);
        System.out.println("Text: " + linkText);
        }
}
}