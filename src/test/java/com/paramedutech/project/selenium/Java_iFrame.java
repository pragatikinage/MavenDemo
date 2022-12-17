package com.paramedutech.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_iFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement title=driver.findElement(By.xpath("//h1[@class='title']"));
		System.out.println(title.getText());
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();
		//driver.switchTo().defaultContent();
		//WebElement title1=driver.findElement(By.xpath("//h1[@class='title']"));
		//System.out.println(title1.getText());
		driver.navigate().back();
		WebElement title1=driver.findElement(By.xpath("//h1[@class='title']"));
		System.out.println(title1.getText());
		
		
	}

}
