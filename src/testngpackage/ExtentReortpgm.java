package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import junit.framework.Assert;

public class ExtentReortpgm {

	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest Test;
	ExtentReports extent;
	String baseUrl="https://www.facebook.com/?_rdr";

@BeforeTest
public void extentreport()
{
	reporter=new ExtentHtmlReporter("./report/myreport1.html");
	reporter.config().setDocumentTitle("Automation Reort");
	reporter.config().setReportName("Functional Test");
	reporter.config().setTheme(Theme.STANDARD);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("host name","Local host ");
	extent.setSystemInfo("os", "Windows11");
	extent.setSystemInfo("tester name", "aug");
	extent.setSystemInfo("browser name","chrome" );
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void bfrmthd()
{
	driver.get(baseUrl);
}

@Test
public void titleV()
{
	Test=extent.createTest("Fb title verification");
	String actualTitle=driver.getTitle();
	String exp="Facebook -log in or sig up";
	Assert.assertEquals(exp, actualTitle);
}
@Test
public void fblogo()
{
	Test=extent.createTest("fb logo Test");
	boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	Assert.assertTrue(b);
	
}
@AfterMethod
public void browserclose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Test.log(Status.FAIL, "test case  failed is"+result.getName());
		Test.log(Status.FAIL, "test case failed is"+result.getThrowable());
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		Test.log(Status.SKIP, "test case skipped is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		Test.log(Status.PASS, "test resultpassed is "+result.getName());
	}
	
}
@AfterTest
public void teardown()
{
	extent.flush();
}
}

