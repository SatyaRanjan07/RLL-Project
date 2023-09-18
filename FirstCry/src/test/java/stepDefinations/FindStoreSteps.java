package stepDefinations;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pageFactory.FindStorePage;
import pageFactory.LandingPage;
import pageFactory.LogInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.ReadExcel;

public class FindStoreSteps extends Driver {
	
	
@Given("A user is on landing page")
public void a_user_is_on_landing_page() {

}


@When("he click on Login page and enter the details")
public void he_click_on_login_page_and_enter_the_details() throws InterruptedException {
	
//	loginPage.enterEmailId();
//	loginPage.clickContinueBtn();
//	Thread.sleep(25000);
//	loginPage.clickSubmitBtn();
	logger.info("FIND STORE FUNCTIONALITY TEST STARTED");
	landingpage.goToLogInPage();
    loginpage.login();
    Thread.sleep(2000);
    loginpage.clickOnCont();
    loginpage.clickOnSubmitBTN();
   
}

@When("he hover over the stores & Preschools")
public void he_hover_over_the_stores_preschools() {
	landingpage.StoresAndPreschools();

}

@When("he click on Find stores")
public void he_click_on_find_stores() {
	landingpage.clickFindStores();
}

@When("he switch focus to new tab")
public void he_switch_focus_to_new_tab() {
 
	ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
}


@When("he select the store Type,state and city and click search button")
public void he_select_the_store_type_state_and_city_and_click_search_button() throws IOException {
	
	String[][] data=ReadExcel.getData("Resources//LocationData.xlsx", "Sheet1");
	
	for(int i=1;i<=2 ;i++) {
		  String storetype=data[i][0];
		  String state=data[i][1];
		  String city=data[i][2];
	
		  Findstorepage.selectFirstcry(storetype);
		  Findstorepage.selectTamilnadu(state);
		  Findstorepage.selectChennaiMedavakkam(city); 
		  Findstorepage.clickSearchBtn();
	
	}
	
}


@Then("he must able to see the Search store result")
public void he_must_able_to_see_the_search_store_result() {
	
	String expectedText="Firstcry Store in Chennai Medavakkam";
	String actualText=Findstorepage.VerifyText();
	Assert.assertEquals(actualText, expectedText);
	logger.info("FIND STORE FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");

}

}
