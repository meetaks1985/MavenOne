package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTestNGprac {
	
	@Test
	public void Sum()
	{
		int a = 10;
		int b = 20;
		System.out.println("SUM");
	
		Assert.assertEquals(30,a+ b);
		
		
	}
	
	@Test
	public void multiply()
	{
		int a = 10;
		int b = 20;
		int c = a*b;
		
		System.out.println("Multipy");

		if (c==200)
		{
		Assert.assertTrue(true,"matching");
		}
		else
		{
			Assert.assertTrue(false,"Notmatching");
		}
	}

}
