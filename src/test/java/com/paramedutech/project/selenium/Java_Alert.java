package com.paramedutech.project.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//alert.dismiss();
		alert.accept();
		alert=driver.switchTo().alert();
		alert.accept();
		
		
	}

}
