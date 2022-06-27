package com.mln.iterviewPrep2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(3000);
		List<WebElement> ListElements1 = driver.findElements(By.xpath("//div/ul[(@jsname='bw4e9b')]/li"));
		
		for (int i = 1; i<ListElements1.size();i++){
			System.out.println("The Name:" + driver.findElement(By.xpath("//div/ul[(@jsname='bw4e9b')]/li["+i+"]//div[1]/span")).getText());
			
			}
		
		driver.get("https://www.google.com/search?q=India+&source=hp&ei=dOG4YpnVKpOPwbkPo8yJgAg&iflsig=AJiK0e8AAAAAYrjvhN1fAs0GvBSnEdtSE9PviWPxSE1e&ved=0ahUKEwiZ37vxmMz4AhWTRzABHSNmAoAQ4dUDCAk&uact=5&oq=India+&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAELEDEIMBMggILhCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgUIABCABDIICAAQsQMQgwEyCAgAELEDEIMBMggIABCABBCxAzIFCAAQgAQyBQgAEIAEOhEILhCABBCxAxCDARDHARDRAzoFCC4QgAQ6CAguEIAEELEDOgsILhCABBDHARCvAToICAAQgAQQyQM6BQgAEJIDOg4ILhCABBCxAxCDARDUAjoLCC4QgAQQsQMQ1AJQAFjf8Adg0JwIaAJwAHgBgAF7iAGqA5IBAzQuMZgBAKABAQ&sclient=gws-wiz");
		
		List<WebElement> ListElements2=	driver.findElements(By.xpath("//h1[(text()='Search Results')]/following::h3/following-sibling::div/cite"));
		
		for (WebElement we :ListElements2){
			System.out.println(we.getText());
			
		}
	}

}
