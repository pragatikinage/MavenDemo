package com.paramedutech.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_webelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://omayo.blogspot.com/");
         driver.manage().window().maximize();
         WebElement male=driver.findElement(By.xpath("//input[@id='radio1']"));
//         System.out.println(male.isDisplayed());
//         System.out.println(male.isEnabled());
//         male.click();
         //System.out.println(male.isSelected());
         WebElement female=driver.findElement(By.xpath("//input[@id='radio2']"));
         WebElement disabled=driver.findElement(By.xpath("//button[@id='but1']"));
         WebElement orange=driver.findElement(By.xpath("//input[@id='checkbox1']"));
         
         WebElement blue=driver.findElement(By.xpath("//input[@id='checkbox2']"));
         System.out.println(orange.isEnabled());
         
         orange.click();
         System.out.println(orange.isSelected());
         System.out.println(blue.isEnabled());
         blue.click();
         System.out.println(blue.isSelected());
         System.out.println(disabled.isEnabled());
	}

}
