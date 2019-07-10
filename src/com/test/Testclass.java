package com.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testclass {

	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	 String parent = driver.getWindowHandle();
	 
	 System.out.println(parent);
	
	driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("mobiles");
	
	driver.findElement(By.xpath("//*[@class= 'vh79eN']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@class='_31qSD5']")).click();
	
	Set<String> child = driver.getWindowHandles();
	
	for(String ch :child)
		
	{
		
		if(!ch.equalsIgnoreCase(parent))
			
			driver.switchTo().window(ch);
		
	}
	
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//*[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();;
	
	Thread.sleep(3000);


	driver.findElement(By.xpath("//*[@class='_2AkmmA iwYpF9 _7UHT_c']")).click();;


	
	}

}
