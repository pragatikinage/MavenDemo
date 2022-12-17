package com.param.testcases;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.param.pages.*;
public class Google_Search_Test {
	
	private static WebElement element=null;
	public static void main(String args[])
	{
	googleSearch();
	}

public static void googleSearch()
{
	System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	element=GoogelSearchPage.textbox_search(driver);
	element.sendKeys("mobile");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	element=GoogelSearchPage.button_search(driver);
	element.click();//if search box is overlapped
	driver.close();
	System.out.println("Test Run successfully");
	
	
	
	
}
}
