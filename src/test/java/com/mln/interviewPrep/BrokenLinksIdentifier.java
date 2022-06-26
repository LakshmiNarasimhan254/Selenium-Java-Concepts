package com.mln.interviewPrep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksIdentifier {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/broken");
		HttpURLConnection huc ;
		int respCode = 0;
		List <WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iter = links.iterator();

		while(iter.hasNext()){
			String url = iter.next().getAttribute("href");
			if (url == null ||url.isEmpty()){
				continue;
			}
			else {
				try {
					huc = (HttpURLConnection)(new URL(url).openConnection());
					huc.setRequestMethod("HEAD");
					huc.connect();
					respCode = huc.getResponseCode();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				;
				System.out.println(respCode);
			}
		}
	}

}
