 
package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCode {

	String link="https://www.facebook.com/";
	@Test
	public void responsecodeFb()
	{
	try
	{
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		if (code==200)
		{
			System.out.println("Successfull Link");
		}
		else
		{
			System.out.println("Not a Successsfull Link");
		}
	}
	catch(Exception e)
	{
		
	}
	}
}