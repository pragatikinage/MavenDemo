package com.paramedutech.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Java_Handle_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/newtours/");
//        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
//        Thread.sleep(10000);
//        WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
//        Thread.sleep(4000);
//        Select select=new Select(dropdown);
//        System.out.println(select.getFirstSelectedOption());
//        System.out.println(select.isMultiple());
//        List<WebElement> list=select.getOptions();
//        for(WebElement e:list)
//        {
//        	System.out.println(e.getText());
//        }
//        Thread.sleep(4000);
//        select.selectByValue("AUSTRALIA");
//        select.selectByVisibleText("INDIA");
//        driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
//        WebElement multiselect=driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
//        Select select=new Select(multiselect);
//        System.out.println(select.isMultiple());
//        select.selectByIndex(0);
//        select.selectByIndex(1);
//        select.selectByIndex(2);
//        List<WebElement> selected_opt=select.getAllSelectedOptions();
//        for(WebElement element:selected_opt)
//        {
//        	System.out.println(element.getText());
//        }
//        Thread.sleep(4000);
//        select.deselectByIndex(1);
        
        driver.get("https://omayo.blogspot.com/");
        
        
     
	}

}
