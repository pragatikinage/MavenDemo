package com.paramedutech.project.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paramedutech.project.Utility;

public class Loginscenariousingexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(String.valueOf(Utility.readexcel().get(0)));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(String.valueOf(Utility.readexcel().get(1)));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
	}

}
