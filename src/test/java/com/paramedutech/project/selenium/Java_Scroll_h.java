package com.paramedutech.project.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Scroll_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/");
		int x=driver.manage().window().getSize().getWidth();
		x=(int)(x*0.90);
		
		JavascriptExecutor jsexec=(	JavascriptExecutor)driver;
		jsexec.executeScript("window.scrollTo(document.body.scrollWidth,0)");

	}

}
