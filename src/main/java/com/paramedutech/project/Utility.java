package com.paramedutech.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
public static void takesScreenshot(WebDriver driver,String filename)
{
	TakesScreenshot takescreenshot=(TakesScreenshot)driver;
	File file=takescreenshot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("src/test/resources/data_screenshots/"+filename+".png"));
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	
}
public static String getProperty(String key) throws IOException
{
	File file=new File("src/test/resources/test.properties");
	FileInputStream in=new FileInputStream(file);
	Properties property=new Properties();
	property.load(in);
	return property.getProperty(key);
	
}
public static WebDriver getDriver()
{
	System.setProperty("webdrive.chrome.driver" ,"src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	return driver;
}
public static List<Object> readexcel()throws IOException
{
	 List<Object> list=new ArrayList();
	File file=new File("src/test/resources/logindata.xls");
	FileInputStream in=new FileInputStream(file);
	HSSFWorkbook hssw=new HSSFWorkbook(in);
	HSSFSheet sheet=hssw.getSheetAt(0);
	int rows=sheet.getLastRowNum();
	for(int i=1;i<=rows;i++)
	{
		HSSFRow row=sheet.getRow(i);
		int lastcell=row.getLastCellNum();
		for(int j=0;j<lastcell;j++)
		{
			if(row.getCell(j).getCellType().equals(CellType.NUMERIC)) {
				int k=(int)row.getCell(j).getNumericCellValue();
				list.add(k);
				
			}
			if(row.getCell(j).getCellType().equals(CellType.STRING))
			{
			list.add(row.getCell(j).getStringCellValue());
			}
		}
		
	}
	hssw.close();
	return list;
}

public static String getValueFromTable(WebDriver driver,String id,int rowindex,int tdindex)
{
	return driver.findElement(By.xpath("//table[@id='"+id+"']//tbody//tr["+rowindex+"]//td["+tdindex+"]")).getText();
}
}
