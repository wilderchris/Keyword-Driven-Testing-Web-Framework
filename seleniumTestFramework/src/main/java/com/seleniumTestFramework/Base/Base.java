package com.seleniumTestFramework.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriver driver = null;
			WebDriverManager.chromedriver().version("77.0.3865.40").setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); 
			options.addArguments("enable-automation"); 
			options.addArguments("--no-sandbox"); 
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation"); 
			options.addArguments("--disable-gpu"); 
			driver = new ChromeDriver(options); 
			driver.get("https://www.google.com/"); 
		}else if(browserName.equals("edge")){
			//Microsoft Edge browser settings needed
		}else if(browserName.equals("chrome")) {
			// Firefox browser settings needed
		}else {
			//error catch custom exception needed
			System.out.println(" Error: Browser not supported..");
		}
		return driver;

	}
	public Properties init_properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(".\\src\\main\\resources\\config.properties");
		prop.load(ip);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
