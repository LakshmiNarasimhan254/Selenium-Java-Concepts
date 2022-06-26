package com.mln.interviewPrep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.indianrail.gov.in/enquiry/TBIS/TrainBetweenImportantStations.html?locale=en");
		//driver.findElement(By.xpath("//input[@id='dt']")).sendKeys("25-06-2022");
		
		driver.findElement(By.xpath("//input[@id='sourceStation']")).sendKeys("chennai");
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/child::li/a[text()='CHENNAI BEACH - MSB']")).click();
		driver.findElement(By.xpath("//input[@id='destinationStation']")).sendKeys("TVC");
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/child::li/a[text()='TRIVANDRUM CNTL - TVC']")).click();
		driver.findElement(By.xpath("//input[@id='modal1']")).click();
			List<WebElement> icols = driver.findElements((By.xpath("//tbody[//td[text() ='TVC']]/tr")));
			System.out.println(icols.size());
			List<WebElement> iRows=	driver.findElements((By.xpath("//td[text() ='TVC']//ancestor::tbody/child::tr")));
			
			for (WebElement row : iRows)
			{		
				System.out.println(row.findElement(By.xpath("/td[2]")).getText());
			
			}
	}

}
