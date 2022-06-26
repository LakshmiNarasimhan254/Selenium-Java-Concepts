package com.mln.interviewPrep;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserTest_Waits {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/**Implicit Wait **/ 
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://automationpractice.com/index.php");
		
		
//		/**explicit  Wait **/ 
//		
//		WebDriverWait wwait =new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element1 =wwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sign in')]")));
//		element1.click();
		
		/**fluent  Wait **/ 
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class); 
				  
		
		//Can use existing methods 
		WebElement element2 = fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sign in')]")));
		element2.click();
		
		// can a create new methods to define the conditions
		WebElement element3 = fwait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			}
			
		});
		element3.click();
		
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Sign-in')]")).click();
	}

}
