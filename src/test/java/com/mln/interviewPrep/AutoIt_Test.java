package com.mln.interviewPrep;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIt_Test {
	
	
	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/**Implicit Wait **/ 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.get("https://filetransfer.io/");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/section[1]/div[5]/div[1]/p[1]/a[1])")).click();
	}		
	

}
