package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScriptprgm {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String actualTitle=driver.getTitle();
System.out.println("Title="+actualTitle);
//Expected title=Facebook
String expectedTitle="Facebook";
if (actualTitle.equalsIgnoreCase(expectedTitle))
{
	System.out.println("same");
}
else
{
	System.out.println("not same");

}
	}

}
