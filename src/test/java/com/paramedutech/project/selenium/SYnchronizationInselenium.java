package com.paramedutech.project.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class SYnchronizationInselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		//wait.until(ExpectedConditions.alertIsPresent());
		FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
		fluentwait.withTimeout(Duration.ofSeconds(6));
		fluentwait.pollingEvery(Duration.ofMillis(1));
		fluentwait.ignoring(TimeoutException.class);
		
		fluentwait.until(ExpectedConditions.alertIsPresent());
		System.out.println("hello");
		Alert alert=driver.switchTo().alert();
		System.out.println("hello");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		System.out.println(alert.getText());
		
		alert.accept();
		
		
		

	}

}
