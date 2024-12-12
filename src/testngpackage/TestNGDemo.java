package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
@BeforeTest
public void setUp()
{
	System.out.println("Browser loading");
}


@BeforeMethod
public void urlloading()
{
	System.out.println("URL details");
}


@Test(priority=3,invocationCount=3,groups="smoke")
public void test1()
{
	System.out.println("Test 1");
}

@Test(priority=2,enabled=true)
public void test2()
{
	System.out.println("Test 2");
}

@Test(priority=1,groups="smoke")
public void test3()
{
	System.out.println("Test 3");
}
@AfterMethod
public void urldetails()
{
	System.out.println("AFTER METHOD DETAILS");
}
@AfterTest
public void teardown()
{
	System.out.println("Quit browser");
}
}