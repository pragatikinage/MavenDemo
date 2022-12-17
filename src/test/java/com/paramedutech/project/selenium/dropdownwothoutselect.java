package com.paramedutech.project.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownwothoutselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airvistara.com/bd/en");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		List<WebElement> dropdown=driver.findElements(By.xpath("//ul[@id='country-scroll']/child::li"));
		System.out.println(dropdown.size());
		driver.findElement(By.xpath("//span[@class='dropdown-caret']")).click();
		for(WebElement e:dropdown)
		{
			System.out.println(e.getText());
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement e=dropdown.get(1);
//	e.click();
	WebElement e=driver.findElement(By.xpath("//ul[@id='country-scroll']/child::li"));
	int k=dropdown.size();
	while(k>0)
	     {
			System.out.println("in loop"+e.getText());
			e.click();
			driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
			driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
			driver.findElement(By.xpath("//span[@class='dropdown-caret']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 e=driver.findElement(By.xpath("//ul[@id='country-scroll']/child::li["+k+"]"));
			 k--;
		}

	}

}
