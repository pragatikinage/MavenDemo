package com.paramedutech.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paramedutech.project.Utility;

public class Java_Screenshots  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(1000);
		Utility.takesScreenshot(driver, "google_home_page"+System.currentTimeMillis());

	}

}
