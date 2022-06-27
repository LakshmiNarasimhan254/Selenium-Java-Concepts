package com.mln.iterviewPrep2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopus {
	
	/*
	 * How to solve: 
	1. Use a third party tool like Sikuli, AutoIt
	2. http://username:password@url.com //Sending credentials via URL
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin::admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
