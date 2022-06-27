package com.mln.iterviewPrep2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class ActiveElement {
	static  WebElement q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Hi");
		
		PageFactory.initElements(driver, ActiveElement.class);
		//using Page factory
		q.sendKeys("Hiya");
	}

}
