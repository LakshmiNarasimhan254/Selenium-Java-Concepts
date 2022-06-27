package com.mln.iterviewPrep2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaysToRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");


		//Refresh 

		//1
		driver.findElement(By.name("q")).sendKeys("ways2refresh");
		driver.navigate().refresh();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//2 
		driver.findElement(By.name("q")).sendKeys("ways2refresh");
		driver.get(driver.getCurrentUrl());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//3
		driver.findElement(By.name("q")).sendKeys("ways2refresh");
		JavascriptExecutor executor  =(JavascriptExecutor) driver;
		executor.executeScript("executor.reload");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//
		driver.findElement(By.name("q")).sendKeys("ways2refresh");
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}


	}

}
