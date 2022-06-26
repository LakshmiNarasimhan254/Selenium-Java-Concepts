package com.mln.interviewPrep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OpenedSession {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/laksh/git/SeleniumJavaFrameWork1/SeleniumJavaFrameWork/drivers/Chrome/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress","localhost:9222");
		WebDriver driver = new ChromeDriver(opt);
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement txtfield = driver.findElement(By.xpath("//h3[contains(text(),'Reserved Train Between Stations')]"));
		Actions action = new Actions(driver);
		action.moveToElement(txtfield, -10, 5).		
		clickAndHold()
	    .moveByOffset(30, 0)
	    .release()
	    .build()
	    .perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		driver.findElement(By.xpath(" //input[@id='sourceStation']")).clear();
//
//		String val = "chen"; 
//
//		for (int i = 0; i < val.length(); i++){
//			char c = val.charAt(i);
//			String s = new StringBuilder().append(c).toString();
//			driver.findElement(By.xpath(" //input[@id='sourceStation']")).sendKeys(s);
//
//		}       
//	
//
//	//WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
//	List<WebElement> eles = driver.findElements(By.xpath("//body/ul[@id='ui-id-1']/li[@class ='ui-menu-item']"));
//	
//	System.out.println(eles.size());
//	for (WebElement ele: eles){
//		String att =ele.findElement(By.tagName("a")).getAttribute("innerText");
//	
//		System.out.println(att);
//		if(att.equalsIgnoreCase("MGR CHENNAI CTL - MAS"))
//		{
//			ele.findElement(By.tagName("a")).click();
//		}
//	}
//
//
//
//
//	// set the driver path- You can also use WebDriverManager for drivers
//
//	//				// Create object of ChromeDriver class
//	//				//ChromeDriver driver=new ChromeDriver();
//	//
//	// getCapabilities will return all browser capabilities
//
//}
}
}


