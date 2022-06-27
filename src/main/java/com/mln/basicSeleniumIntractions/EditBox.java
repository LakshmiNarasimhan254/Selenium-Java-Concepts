package com.mln.basicSeleniumIntractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("Lakme88@gmail.com");
		driver.findElement(By.xpath("//input[(@type='text')]")).sendKeys("ing at the end" + "\t");
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("//label[contains(text(),'Clear')]/following::input")).clear();
		String attributeVal = driver.findElement(By.xpath("//label[contains(text(),'disabled')]/following::input")).getAttribute("disabled");
		System.out.println(attributeVal);
		if (attributeVal.equals("true")){
			System.out.println("The Text Field is disabled");
		}
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
