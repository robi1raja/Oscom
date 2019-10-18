package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.get("https://demo.oscommerce.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
      return driver;
     
    	  
      
	}
	
	
}
