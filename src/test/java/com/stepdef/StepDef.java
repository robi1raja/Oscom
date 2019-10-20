package com.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base{
	PageObjectModel PP;
	
	

@Given("^User will on the Signup page$")
public void user_will_on_the_Signup_page() throws Throwable {
     getDriver();
     PP=PageFactory.initElements(driver, PageObjectModel.class);
    
}

@When("^User will click on MyAccount button$")
public void user_will_click_on_MyAccount_button() throws Throwable {
   PP.MyAccount.click();
  Thread.sleep(2000);  
}

@When("^User will click Continue button$")
public void user_will_click_Continue_button() throws Throwable {
   PP.CustomerSignup.click();
   Thread.sleep(2000); 
}

@When("^User will select Male radio button$")
public void user_will_select_Male_radio_button() throws Throwable {
   PP.GenderM.click();  
   Thread.sleep(2000); 
}


@When("^User will put Month \"([^\"]*)\" and Year \"([^\"]*)\" and Date \"([^\"]*)\"$")
public void user_will_put_Month_and_Year_and_Date(String Month, String Year, String Date) throws Throwable {
    PP.DoB.click();
    WebElement Month1=PP.Month_DD;
    Select Month_1 = new Select(Month1);
    Month_1.selectByVisibleText(Month);
    WebElement Year1=PP.Year_DD;
    Select Year_1 = new Select(Year1);
    Year_1.selectByVisibleText(Year);
    
   
    List<WebElement>LwE=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	
	

	int totalcount = LwE.size();
	

	for (int i=0; i<totalcount;i++) {
		WebElement element=LwE.get(i);
		String text=element.getText();
		//System.out.println(text);
		if(text.equalsIgnoreCase(Date)) {
			element.click();
			break;
		}
	
	
	
	}	
    Thread.sleep(2000); 
}




//@When("^User will put Date of Birth$")
//public void user_will_put_Date_of_Birth() throws Throwable {
  //PP.DoB.click();
  //PP.getMonth();
    
//}

@When("^User will enter \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_enter(String FirstName, String LastName, String EMail, String Street, String PostCode, String City, String State, String Telephone) throws Throwable {
 PP.FirstName.sendKeys(FirstName);  
 PP.LastName.sendKeys(LastName);
 PP.Email.sendKeys(EMail);   
 PP.StreetAddress.sendKeys(Street);
 PP.PostCode.sendKeys(PostCode);
 PP.City.sendKeys(City);
 PP.State.sendKeys(State);
 PP.TelePhone.sendKeys(Telephone);
 
 Thread.sleep(2000); 
}


 @When("^User will select \"([^\"]*)\"$")
 public void user_will_select(String CountryName) throws Exception {
    
	WebElement country = PP.SelectCountry;
	Select c1=new Select(country);
	c1.selectByVisibleText(CountryName);
	
	Thread.sleep(2000); 
}

@When("^User will put \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_put(String Password, String CPassword) throws Throwable {
   PP.Password.sendKeys(Password);
   PP.CPassword.sendKeys(CPassword);
   Thread.sleep(2000);    
}

@When("^User will click on continue$")
public void user_will_click_on_continue() throws Throwable {
   PP.SContinue.click();
   Thread.sleep(2000); 
}

@When("^User will varify$")
public void user_will_varify() throws Throwable {
   PP.Proof.getText();
   Assert.assertEquals(PP.Proof.getText(), "Your Account Has Been Created!");
   Thread.sleep(2000);   
}
@Then("^User will quit the Browser$")
public void User_will_quit_the_Browser() throws Throwable {
	driver.quit();
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
