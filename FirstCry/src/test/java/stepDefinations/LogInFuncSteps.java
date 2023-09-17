package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LandingPage;

public class LogInFuncSteps extends Driver {
	

@When("user click on the login button")
public void user_click_on_the_login_button() {
	landingpage.goToLogInPage();
}

@When("user enter emailid")
public void user_enter_emailid() {
	loginpage.login();
}

@When("user click on the continue button")
public void user_click_on_the_continue_button() throws InterruptedException {
	Thread.sleep(2000);
	loginpage.clickOnCont();
}

@When("user click the submit button")
public void user_click_the_submit_button() throws InterruptedException {
	loginpage.clickOnSubmitBTN();
   
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() {
	
	  String actualValue = landingpage.getMyaccText();
	  String expectedValue = "My Account";
	  Assert.assertEquals(actualValue, expectedValue);
    
}


}
