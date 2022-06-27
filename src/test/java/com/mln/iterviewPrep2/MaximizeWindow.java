package com.mln.iterviewPrep2;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeWindow {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-panni");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		//Maximize.
		//1
		
		driver.manage().window().maximize();
		
		//2
		driver.manage().window().minimize();
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		
		
	}

}
