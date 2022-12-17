package com.paramedutech.project.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.paramedutech.project.Utility;

public class TestNgannotation {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void TestPlan()
	{
		System.out.println("TestPlan");
	}
	@BeforeClass	
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	@Test
	public void verify_login()
	{
		driver=Utility.getDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	
	

}
