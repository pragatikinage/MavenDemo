package com.paramedutech.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airvistara.com/bd/en");
		WebElement e=driver.findElement(By.xpath("//span[@id='flight_icon_change ']"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
		JavascriptExecutor jsexec=(	JavascriptExecutor)driver;
		jsexec.executeScript("arguments[0].scrollIntoView(true);",e);
		jsexec.executeScript("window.scrollBy(0,800)","");
		jsexec.executeScript("window.scrollBy(0,-500)","");
//		driver.get("https://www.demo.guru99.com/test/guru99home/scrolling.html");
//		jsexec=(JavascriptExecutor)driver;
//		e=driver.findElement(By.xpath("//a[contains(text(),'VBScript')]"));//
//		jsexec.executeScript("arguments[0].scrollIntoView(true);",e);
		driver.get("https://www.album.alexflueras.ro/");
		jsexec=(JavascriptExecutor)driver;
		jsexec.executeScript("window.scrollBy(400,0)","");
       	
	}
	

}
