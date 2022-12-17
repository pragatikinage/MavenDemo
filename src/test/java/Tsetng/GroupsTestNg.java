package Tsetng;
import org.testng.annotations.Test;
import com.paramedutech.project.ListenerUse;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.paramedutech.project.Utility;

@Listeners(ListenerUse.class)

public class GroupsTestNg {
	WebDriver driver;
	
	
	@Test(groups= {"Sanity"})
	public void verifylogin()
	{
		
		System.out.println("1");
		
	
	}
	
	@Test(groups= {"Smoke",""})
	public void verifyRegistration()
	{
		
		System.out.println("2");
		
	
	}
	@Test(groups= {"E2E","Smoke"})
	public void test3()
	{
		
		
		System.out.println("3");
	
	}
	@Test(groups= {"reg",""})
	public void test4()
	{
		
		System.out.println("4");
		
		
	
	}

}
