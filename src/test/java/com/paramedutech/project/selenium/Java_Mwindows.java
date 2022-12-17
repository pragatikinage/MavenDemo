package com.paramedutech.project.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Java_Mwindows {
        
	public static void main(String[] args) {
		String title[]=new String[10];
        int c=0;
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jsexec=(	JavascriptExecutor)driver;
		jsexec.executeScript("window.open('https://www.flipkart.com/','_blank');");
		jsexec.executeScript("window.open('https://www.facebook.com/','_blank');");
		title[c]=new String();
		title[c++]=driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		String parent_handle=driver.getWindowHandle();
		Set<String> allhandles=driver.getWindowHandles();
		for(String handle:allhandles) {
			if(!handle.equals(parent_handle))
			{
				driver.switchTo().window(handle);
				title[c]=new String();
				title[c++]=driver.getTitle();
				//driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("user1");
			}
		}
		//closing window one by one
		for(int i=--c;i>=0;i--) {
			allhandles=driver.getWindowHandles();
		for(String handle:allhandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().equals(title[i]))
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.close();
				
				//driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("user1");
			}
		}
		}
		//driver.close();
//		driver.switchTo().window(parent_handle);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
//	    driver.quit();

	}

}
