package com.paramedutech.project.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class Java_HandleUsage {

	public static void main(String[] args) throws TimeoutException{
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		//implicit 250millisecond(default)
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//explicit wait 500millisecond(Default)
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		//wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/child::li"))));
		FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
		fluentwait.withTimeout(Duration.ofSeconds(20));
		fluentwait.pollingEvery(Duration.ofMillis(1));
		fluentwait.ignoring(TimeoutException.class);
		
		fluentwait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/child::li"))));
	
		List<WebElement> li=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/child::li"));
		
		
		
		
		System.out.println(li.size());
		for(WebElement w:li)
		{
			System.out.println(w.getText());
		}
	}

}
