package com.paramedutech.project.selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paramedutech.project.Utility;

public class java_webbrowsernaviation {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",Utility.getProperty("chromedriver"));
        WebDriver driver=new ChromeDriver();
        driver.get(Utility.getProperty("url"));
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.navigate().to("https://www.amazon.in/");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().forward();
//        driver.navigate().refresh();

	}

}
