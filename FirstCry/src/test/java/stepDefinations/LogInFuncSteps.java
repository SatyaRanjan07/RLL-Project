package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.google.common.io.Files;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LandingPage;

public class LogInFuncSteps extends Driver {
	

@When("user click on the login button")
public void user_click_on_the_login_button() {
	logger.info("LOGIN FUNCTIONALITY TEST STARTED");
	landingpage.goToLogInPage();
}

@When("user enter valid emailid")
public void user_enter_valid_emailid() {
	loginpage.login();
}

@When("user click on the continue button")
public void user_click_on_the_continue_button() throws InterruptedException {
	Thread.sleep(2000);
	loginpage.clickOnCont();
}

@When("user click the submit button")
public void user_click_the_submit_button() throws InterruptedException, IOException {

	loginpage.clickOnSubmitBTN();
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() throws IOException {
	
		  String actualValue = landingpage.getMyaccText();
		  String expectedValue = "My Account";
		  Assert.assertEquals(actualValue, expectedValue);
		
    
}

@When("user again go to login page")
public void user_again_go_to_login_page() throws InterruptedException {
    hovermouse.hoverOverMyAccount();
    Thread.sleep(2000);
    hovermouse.clickLogOut();
}

@When("enter invalid emailid")
public void enter_invalid_emailid() throws InterruptedException {
	Thread.sleep(5000);
	landingpage.goToLogInPage();
	Thread.sleep(2000);
    loginpage.giveInvalidEmailId();
}

@Then("user cant login and screenshot is generated")
public void user_cant_login_and_screenshot_is_generated() throws IOException, InterruptedException {
	try {
	 loginpage.clickOnSubmitBTN();
  } catch (NoSuchElementException  e) {
	TakesScreenshot screenshot = (TakesScreenshot) driver;
    File src = screenshot.getScreenshotAs(OutputType.FILE);
    File dest = new File("C:\\Users\\ASUS\\git\\RLL-Project\\FirstCry\\TestReport\\screenshots\\ErrorSS.png");
    Files.copy(src,dest);
    driver.close();
}
	  logger.info("LOGIN FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
}


}
