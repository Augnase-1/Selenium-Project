package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
@Parameters("s")
	@Test
	public void paraMtr(String s)
	{
	System.out.println("parameter value ="+s);
	}
}
