package com.mln.iterviewPrep2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ways2SearchinG {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("\n");
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("q")).submit();
	}

}
