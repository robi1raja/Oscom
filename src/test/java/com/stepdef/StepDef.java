package com.stepdef;

import org.openqa.selenium.support.PageFactory;
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
    
}

@When("^User will click Continue button$")
public void user_will_click_Continue_button() throws Throwable {
   PP.CustomerSignup.click();
    
}

@When("^User will select Male radio button$")
public void user_will_select_Male_radio_button() throws Throwable {
   PP.GenderM.click();    
}

@When("^User will put Date of Birth$")
public void user_will_put_Date_of_Birth() throws Throwable {
  PP.DoB.click();
  PP.getMonth();
    
}

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
}

@When("^User will select country name$")
public void user_will_select_country_name() throws Throwable {
   PP.getCountry();
    
}

@When("^User will put \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_put(String Password, String CPassword) throws Throwable {
   PP.Password.sendKeys(Password);
   PP.CPassword.sendKeys(CPassword);
    
}

@When("^User will click on continue$")
public void user_will_click_on_continue() throws Throwable {
   PP.SContinue.click();
    
}

@When("^User will varify$")
public void user_will_varify() throws Throwable {
   PP.Proof.getText();
   Assert.assertEquals(PP.Proof.getText(), "Your Account Has Been Created!");
    
}
@Then("^User will quit the Browser$")
public void User_will_quit_the_Browser() throws Throwable {
	driver.quit();
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
