package Practice1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class annotations {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(true);
	}
	@AfterSuite
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	




}
