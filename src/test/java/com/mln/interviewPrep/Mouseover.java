package com.mln.interviewPrep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://demoqa.com/menu/");
//		WebElement mainmenu = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
//
//		Actions act = new Actions(driver);
//		act.moveToElement(mainmenu).perform();
//		WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
//		act.moveToElement(submenu).perform();
//		WebElement subitem = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
//		act.moveToElement(subitem);
//		act.click().build().perform();

		String s = "maerica";
		System.out.println(s.substring(1, 4));
		System.out.println(s.split("r")[1]);
		
		
	}

}


