package com.paramedutech.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//a[@title='My Account']")).click();
         driver.findElement(By.xpath("//a[text()='Login']")).click();
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prgati@gmail.com");
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("yukta");
         driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

}
