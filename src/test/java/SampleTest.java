package test.java;

import net.sf.testng.databinding.DataBinding;
import net.sf.testng.databinding.properties.PropertiesDataSource;
import net.sf.testng.databinding.TestInput;
import org.testng.annotations.Test;
import test.java.data.LoginCredentials;

public class SampleTest
{
	@Test
	@DataBinding
	public void testCsvMethod(@TestInput(name = "data") String data)
	{
		System.out.println(data);
	}

	@Test
	@DataBinding
	public void testTextMethod(@TestInput(name = "sampleText") String data)
	{
		System.out.println(data);
	}

	@Test
	@DataBinding
	public void testXmlMethod(@TestInput(name = "data") String data)
	{
		System.out.println(data);
	}

	@Test
	@DataBinding
	public void testPropertiesMethod(@TestInput final LoginCredentials loginCredentials)
	{
		System.out.println(loginCredentials.getUserName());
		System.out.println(loginCredentials.getPassword());
	}
}
