package com.mln.interviewPrep;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mln.config.Properties_File;
import com.mln.pages.Login_MyStore;
import com.mln.pages.MyStore;
import com.mln.util.Excel_Methods;
import com.mln.util.Wrapper_Methods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		String strTestName = "TC-1";
		String strUrl = Properties_File.getProperties("URL");
		
	
		
		Wrapper_Methods wm = new Wrapper_Methods(driver, strTestName);
		Excel_Methods em = new Excel_Methods(strTestName);
		String ProjectPath = System.getProperty("user.dir");
		//String strBrowser = em.getCellValueString(1, 0);
		String strBrowser = "edge";
		String stxtboxvalue =em.getCellValueString(1, 2);
		
		driver = wm.setBrowser(strBrowser);
		wm.LaunchApp(driver,strUrl);	
		MyStore mystore = new MyStore(driver, strTestName);		
		mystore.ClickSignin(wm);
		
		Login_MyStore loginmystore = new Login_MyStore(driver, strTestName);		
		loginmystore.EnterTxtCreateEmail(wm, stxtboxvalue);
		loginmystore.ClickCreateAccount(wm);
		Thread.sleep(1000);
		
		wm.CloseApp(driver);;
		
	

	}

}
