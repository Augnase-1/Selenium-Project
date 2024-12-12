package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropDown {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

@Test 
public void rediffDropdownDate()
{
	
	WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
	WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	WebElement country=driver.findElement(By.xpath("//*[@id='country']"));
	WebElement city=driver.findElement(By.xpath("//*[contains(@name,'city')]"));

	Select dayDetails=new Select(day);
	dayDetails.selectByValue("06");
	
	Select monthDetails=new Select(month);
	monthDetails.selectByVisibleText("AUG");
	
	Select yearDetails = new Select(year);
	yearDetails.selectByVisibleText("1986");
	
	Select countryDetails=new Select(country);
	countryDetails.selectByVisibleText("India");

	Select cityDetails=new Select(city);
	cityDetails.selectByVisibleText("Agra");
}			
}
