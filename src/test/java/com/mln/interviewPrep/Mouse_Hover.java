package com.mln.interviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/s?i=fashion-womens&bbn=16334314011&rh=n%3A7141123011%2Cn%3A16334314011%2Cn%3A7147440011%2Cn%3A1040660%2Cn%3A1045024%2Cp_89%3ADaily+Ritual&pf_rd_p=e0bdaaa7-6f81-4c4a-9ee8-05cbc1693e52&pf_rd_r=GA1XKWN8C36HWZG2CZEE&qid=1595545753&rnid=2528832011l&ref=af_gw_spb_topcatcard_sum_DR_dress");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
}
