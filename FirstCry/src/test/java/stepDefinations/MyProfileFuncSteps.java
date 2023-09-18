package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.ReadExcel;

public class MyProfileFuncSteps extends Driver 
{
//	WebDriver driver;
//	HoverMouse hovermouse; 
//    ReadExcel excelReader;
	
	@Given("I open the browser")
	public void i_open_the_browser() 
	{
//	    driver = new EdgeDriver();
//	    driver.manage().window().maximize();
		logger.info("MY PROFILE FUNCTIONALITY TEST STARTED");
	}

	@When("I navigate to the application")
	public void i_navigate_to_the_application() 
	{
//	    driver.get("https://www.firstcry.com/");
	}
	
	@When("I Log in with valid credentials")
	public void i_log_in_with_valid_credentials() throws InterruptedException {
//	    LoginPage login = new LoginPage(driver);
		landingpage.goToLogInPage();
	    loginpage.login();
	    Thread.sleep(2000);
	    loginpage.clickOnCont();
	    loginpage.clickOnSubmitBTN();
		
	}

	@When("I click on My Account")
	public void i_click_on_my_account() 
	{
//		hovermouse = new HoverMouse(driver);
		hovermouse.hoverOverMyAccount();
	}

	@When("I select My Profile")
	public void i_select_my_profile() 
	{
		hovermouse.clickMyProfile();
	}

	@When("I perform an Edit operation")
	public void i_perform_an_edit_operation() throws IOException, InterruptedException 
	{
//      EditAddressBook addressBook = new EditAddressBook(driver);
		
		String[][] data = ReadExcel.getData("Resources//Data.xlsx", "Sheet1");

		for(int i = 1; i < 2; i++)
		{
			String name = data[i][0];
			String buildingName = data[i][1];
			String streetAddress = data[i][2];
			String pincode = data[i][3];
			String city = data[i][4];
			String state = data[i][5];
			String country = data[i][6];
			String mobileNo = data[i][7];
					
		boolean dataIsCorrect = true;
		if (dataIsCorrect) {
//		    addressBook.enterDetails();
			Thread.sleep(3000);
			addressBook.enterDetails(name, buildingName, streetAddress, pincode, city, state, country, mobileNo);
			
//			addressBook.enterDetails();
		} else {
			String expectedErrText = "Special characters & Numbers are not allowed. Max up to 40 Characters.";
		    String actualErrText = addressBook.getErrText();

		    // Print actual and expected error messages for debugging
		    System.out.println("Expected Error Text: " + expectedErrText);
		    System.out.println("Actual Error Text: " + actualErrText);
		    logger.info("MY PROFILE FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");

	}
	}
}
}
