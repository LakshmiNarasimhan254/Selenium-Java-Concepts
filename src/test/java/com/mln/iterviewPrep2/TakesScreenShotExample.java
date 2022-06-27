package com.mln.iterviewPrep2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		//Takes Screenshot
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		//Stores the screenshot as File
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		//Create file called Sample.png to copy the above source file 
		File Destinationfile= new File("Sample1.png");

		//Calling the user(that's me) defined method for taking screen shot 
		takeSSFileHandler(sourceFile,Destinationfile);
		takeSSFileUtils(sourceFile,new File("Sample2.png"));
		
		
		//Now let's click on the 
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
		
		
		//Calling the user(that's me) defined method for taking screen shot 
		//FYI - This will not work because Alert found exception will be thrown without handling that 
		//the flow of the program will not move- To overcome this see the CreateScreenCapture. java program
		
				takeSSFileHandler(sourceFile,Destinationfile);
				takeSSFileUtils(sourceFile,new File("Sample2.png"));
				
				
				driver.quit();
		
	}

	private static void takeSSFileUtils(File sourceFile, File destinationfile) {
		try {
			//Using Apachi poi FileUtils
			FileUtils.copyFile(sourceFile, destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void takeSSFileHandler(File sourceFile, File destinationfile) {
		try {
			//Using selenium built in class
			FileHandler.copy(sourceFile, destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
