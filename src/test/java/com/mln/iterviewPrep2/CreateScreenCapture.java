package com.mln.iterviewPrep2;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateScreenCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		File file = new File("Sample3.png");
					
		//Now let's click on the 
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
		
		try {
			Robot robot = new Robot();
			Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRect = new Rectangle(ScreenSize);
		    BufferedImage bufferScreenShot = robot.createScreenCapture(screenRect);
		    
			ImageIO.write(bufferScreenShot, ".png", file);
		} catch (AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.quit();

	}

}
