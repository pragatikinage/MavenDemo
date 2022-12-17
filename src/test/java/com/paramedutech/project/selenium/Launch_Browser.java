package com.paramedutech.project.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         //driver.get("https://www.selenium.dev/documentation/overview/");
         //driver.get("https://testleaf.herokuapp.com/");
         driver.get("http://www.tutorialsninja.com/demo/");
        // driver.manage().window().maximize();
       //  WebElement element=driver.findElement(By.xpath("//a[text()='Overview']"));
        // element.click();
        //WebElement element= driver.findElement(By.className("wp-categories-link"));
        //element.click();
         
//         System.out.println(driver.getTitle());
//         System.out.println(driver.getPageSource());
//         System.out.println(driver.getCurrentUrl());
         
         //driver.findElements(By.tagName("input")).get(2).sendKeys("test");
//         driver.findElement(By.linkText("Cameras")).click();
//         driver.findElement(By.partialLinkText("Notebooks")).click();
//         driver.findElement(By.id("list-view")).click();
         //driver.findElement(By.name("search")).clear();
//         driver.findElement(By.cssSelector("a[id='wishlist-total']")).click();
        // driver.findElement(By.cssSelector("a#wishlist-total")).click();
//        driver.findElement(By.cssSelector("button[class='btn btn-link dropdown-toggle']")).click();
        
         //WebElement element1=driver.findElement(By.xpath("//input[@name='search']"));
        // element1.sendKeys("test");
         //driver.findElement(By.xpath("//*[@name=\"EUR\"and @type='button']")).click();
      // element1=driver.findElement(By.xpath("//a[text()='Software']"));
      // element1.click();
       // WebElement element1=driver.findElement(By.xpath("//input[starts-with(@name,'sea')]"));
       //  element1.sendKeys("hello");
         WebElement element1=driver.findElement(By.xpath("//input[contains(@type,'ext')]"));
         element1.sendKeys("hello");
         System.out.println(driver.findElement(By.xpath("(//a)")).getText());
	}

}
