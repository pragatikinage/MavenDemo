package Tsetng;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paramedutech.project.Utility;

import dev.failsafe.internal.util.Assert;
public class HardsoftAssert {
	WebDriver driver;
	@BeforeMethod
	public void getWebDriver()
	{
		driver=Utility.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	@Test(priority=0,enabled=true)
	public void verifylogin()
	{
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement success_message=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		//assertEquals(success_message.getText(), "Login Successfully");
		org.testng.Assert.assertEquals(success_message.getText(), "Login Successfully");
	
		
	
	}
		
		
	

	
	@Test(priority=1)
	public void verifypagetitle()
	{
		driver.findElement(By.linkText("REGISTER"));
		String title=driver.getTitle();
	assertTrue(title.equals("Register:Mercury Tours"), "Register page");
	
	Reporter.log("Verification 3 done");
	assertFalse(title.equals("Register"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
