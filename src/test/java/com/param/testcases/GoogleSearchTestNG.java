package com.param.testcases;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.param.pages.*;

public class GoogleSearchTestNG {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
	 driver=new ChromeDriver();
	}
	
	@Test
	public void googleSearch()
	{
		driver.get("https://www.google.com/");
		GoogelSearchPage.textbox_search(driver).sendKeys("mobile");
		
		WebElement element=GoogelSearchPage.button_search(driver);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeSelected(element));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		element.click();
		
		Reporter.log("Verification done");
		
	}
	@AfterMethod
	public void teardown()
	{
		
	}
	
	
	
}
