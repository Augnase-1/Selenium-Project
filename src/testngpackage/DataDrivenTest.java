package testngpackage;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest {
	ChromeDriver driver;
	  @BeforeTest
	  public  void setUp()
	  {
		  driver=new ChromeDriver();
}
	  
	  @Test
	  public void dataDriven() throws IOException
	  {
		 driver.get("https://www.facebook.com/"); 
		 FileInputStream fi=new FileInputStream ("C:\\Users\\augna\\Desktop\\Book1.datadriven.xlsx");
		 XSSFWorkbook wb= new XSSFWorkbook(fi);//appachepoi
		 XSSFSheet sh= wb.getSheet("Sheet1");
		 int rowCount=sh.getLastRowNum();
		 for (int i=1;i<=rowCount;i++)
		 {
			String user=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username:"+user);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
		    System.out.println("password:"+password);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		 }
	  }		 
}
