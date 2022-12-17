package com.paramedutech.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.paramedutech.project.Utility;

public class Reading_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
//		WebElement e=driver.findElement(By.xpath("//input[@id='uploadfile']"));
//		JavascriptExecutor jsexec=(	JavascriptExecutor)driver;
//		jsexec.executeScript("arguments[0].scrollIntoView(true);",e);
//		e.sendKeys("C:\\Users\\surab\\com.paramedutech.project\\src\\test\\resources\\test.properties");
//		WebElement k=driver.findElement(By.xpath("//button[normalize-space()='Double click Here']"));
//		//handling hidden element
//		int height=k.getSize().getHeight();
//		int width=k.getSize().getWidth();
//		System.out.println("height and width"+height+"  "+width);
//		Actions actions=new Actions(driver);
//		JavascriptExecutor jsexec1=(	JavascriptExecutor)driver;
//		jsexec1.executeScript("arguments[0].scrollIntoView(true);",k);
//		actions.doubleClick();
//		System.out.println(Utility.getValueFromTable(driver,"table1", 1, 2));
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='widget-content']/child::textarea"));
		String s1=Keys.chord(Keys.CONTROL,"a");
		String s2=Keys.chord(Keys.CONTROL,"c");
		String s3=Keys.chord(Keys.CONTROL,"v");
		list.get(1).sendKeys(s1);
		list.get(1).sendKeys(s2);
		list.get(0).sendKeys(s3);
		
		
	}

}
