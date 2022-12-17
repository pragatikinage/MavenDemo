package Tsetng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
	 driver=new ChromeDriver();
	}
	@Test
	public void launchGuru()
	{
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	@Test
	public void launchGoogle()
	{
		
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void launchAmazon()
	{
		
		driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public void teardown()
	{
		
	}


}
