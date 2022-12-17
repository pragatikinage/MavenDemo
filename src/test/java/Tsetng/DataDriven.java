package Tsetng;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paramedutech.project.Utility;

public class DataDriven {
	WebDriver driver;
	@BeforeMethod
	public void getWebDriver()
	{
		driver=Utility.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
	}
	@Test(dataProvider = "loginDP")
	public void verifylogin(String user,String pass)
	{
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement success_message=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		//assertEquals(success_message.getText(), "Login Successfully");
		org.testng.Assert.assertEquals(success_message.getText(), "Login Successfully");
	
		
	}
	@DataProvider(name="loginDP")
		public String[][] dataProvider()
		{
			String array[][]= {{"admin","pass"},{"admin1","pass1"},{"admin2","pass3"}};
			return array;
		}
		
	

	
	
	
}
