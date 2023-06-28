package com.shimbhu.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shimbhu.Model.Calculator;

public class CalculatorTest {

	@BeforeAll
	public static void beforeAlls()
	{
		System.out.println("Before all is called.");
	}
	
	@BeforeEach
	public void beforerEveryone()
	{
		System.out.println("before each is called.");
	}
	
	@Test
	public void testDivide_WhenTenDivideByTwo_thenReturnResultFive()
	{
		
		Calculator cal = new Calculator();
		
		float result  = cal.divide(10,2);
		
		Assertions.assertEquals(5,result,"10/2 should return 5.");
	
	}
	
	@Test
	public void testDivide_WhenNegativeTenDivideByFive_thenReturnResultTwo()
	{
		
		Calculator cal = new Calculator();
		
		float result  = cal.divide(-10,2);
		
		Assertions.assertEquals(-5,result,"-10/2 should return -5.");
		
	}
	
	@AfterEach
	public void afterEveryone()
	{
		System.out.println("after each is called.");
	}
	
	@AfterAll
	public static void afterAlls()
	{
		System.out.println("after all is called.");
	}
	
	
}
