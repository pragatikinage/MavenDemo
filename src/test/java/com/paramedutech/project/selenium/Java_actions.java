package com.paramedutech.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions action=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//a[@class='gb_d']"));
		action.moveToElement(e).build().perform();
      e=driver.findElement(By.xpath("//input[@class='gLFyf']"));
      action.sendKeys(e,Keys.chord("a")).build().perform();
	}

}
