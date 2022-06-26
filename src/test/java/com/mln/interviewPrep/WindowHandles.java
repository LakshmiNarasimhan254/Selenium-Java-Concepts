package com.mln.interviewPrep;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		//driver.findElement(By.xpath("//iframe[@id='frame1']")).click();
		//This is a comment i added in git hub at doing from my Lakshmi Mohan Primary account. //
		
		driver.switchTo().frame(0);
		//String stext1 = driver.switchTo().frame(0).findElement(by.)
		
		//String stext1 = driver.switchTo().frame("frame1").findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		//driver.switchTo().defaultContent();
		String stext1 = driver.getTitle();
		//Alert
		//
//		String sText = driver.switchTo().alert().getText();
	System.out.println(stext1);
		Thread.sleep(5000);
		//driver.switchTo().alert().sendKeys("Text");
	//Thread.sleep(5000);
	//driver.switchTo().alert().dismiss();
		
		//New Tab,New Window

		//		String mainWindowHandle = driver.getWindowHandle();
		//		System.out.println(mainWindowHandle); 
		//
		//		Set<String> allWindowHandles = driver.getWindowHandles();
		//		Iterator<String> iterator = allWindowHandles.iterator();
		//
		//		while (iterator.hasNext()) {
		//			String ChildWindow = iterator.next();
		//			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		//				driver.switchTo().window(ChildWindow);
		//				WebElement text = driver.findElement(By.id("sampleHeading"));
		//				System.out.println("Heading of child window is " + text.getText());
		//			}
		//		}
		//	}
	}}

