package testngpackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertion {
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
		  String expectedTitle="Google";
		  if (actualTitle.equals(expectedTitle))
		  {
		  	System.out.println("Pass");
		  }
		  else
		  {
		  	System.out.println("Fail");

		  }
		  System.out.println("hello");
	  }
}
