package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel {
      WebDriver driver;
      public PageObjectModel(WebDriver driver) {
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
      }
      
      
      @FindBy(xpath="//a[@id='tdb3']")
     public WebElement MyAccount;
      
      @FindBy(xpath="//a[@id='tdb2']")
      public WebElement CustomerSignup;
      
      @FindBy(xpath="//input[@value='m']")
      public WebElement GenderM ;
      
      @FindBy(xpath="//input[@name='firstname']")
      public WebElement FirstName ;
      
      @FindBy(xpath="//input[@name='lastname']")
      public WebElement LastName;
      
      @FindBy(xpath="//input[@name='email_address']")
      public WebElement Email ;
      
      
      @FindBy(xpath="//input[@name='street_address']")
      public WebElement StreetAddress ;
     
      @FindBy(xpath="//input[@name='postcode']")
      public WebElement PostCode ;
      
      @FindBy(xpath="//input[@name='city']")
      public WebElement City ;
      
      @FindBy(xpath="//input[@name='state']")
      public WebElement State ;
      
      //country name
      @FindBy(xpath="//*[@name='country']")
      public WebElement SelectCountry ;
      
      
    
      
      
      
      
      @FindBy(xpath="//input[@name='telephone']")
      public WebElement TelePhone ;
      
      
      @FindBy(xpath="(//input[@type='password'])[1]")
      public WebElement Password ;
      
      @FindBy(xpath="(//input[@type='password'])[2]")
      public WebElement CPassword ;
      
      @FindBy(xpath="//button[@id='tdb4']")
      public WebElement SContinue ;
	
      
      
      @FindBy(xpath="//input[@id='dob']")
      public WebElement DoB ;
      
	@FindBy(xpath="//*[contains(text(),'Your Account Has Been Created!')]")
	public WebElement Proof;

	
	
	@FindBy(xpath="//*[@class='ui-datepicker-month']")
	public WebElement Month_DD;
	
	
	@FindBy(xpath="//*[@class='ui-datepicker-year']")
	public WebElement Year_DD;
	
	@FindBy(xpath="//a[@class='ui-state-default']")
	public WebElement ListOfDate;
	
	
	
 //	date xpath //a[@class='ui-state-default']
	
	
	

     public WebDriver getMonth() {
    	 
    	 WebElement Month_dropdown = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
   	     Select Month_d1=new Select(Month_dropdown);
   	     
   	     Month_d1.selectByValue("7");
   	     
   	     WebElement Year_dropdown = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
   	     Select Year_d2=new Select(Year_dropdown);
   	     Year_d2.selectByValue("1990");
   	     
   	     WebElement Date21 = driver.findElement(By.xpath("(//*[@class='ui-state-default'])[20]"));
   	     Date21.click();
   	     
   	     
   	     return driver;
     } 
   	  
   	 
    	 
	 
 
     
     public WebDriver getCountry() {
  	 WebElement CountryName= driver.findElement(By.xpath("//*[@name='country']"));
  	 Select Countryname= new Select(CountryName);
  	 Countryname.selectByVisibleText("Bangladesh");
  	 
  	 return driver;
  		   
     
     }
}

