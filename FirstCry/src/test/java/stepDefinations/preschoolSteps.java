package stepDefinations;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.ReadExcel;


public class preschoolSteps extends Driver {
	
//	@Given("A user is on landing page")
//		public void a_user_is_on_landing_page() throws InterruptedException  {
////		Assert.assertTrue(driver.getTitle().equals("Baby Products Online India: Newborn Baby Products &amp; Kids Online Shopping at FirstCry.com"));
//		
//	}
	@When("he clicks on login")
	public void he_clicks_on_login() throws InterruptedException {

		landingpage.goToLogInPage();
	    loginpage.login();
	    Thread.sleep(2000);
	    loginpage.clickOnCont();
	    loginpage.clickOnSubmitBTN();
		 
	}

	@When("he entered into login page")
	public void he_entered_into_login_page() {
		
 
	}

	@When("he hovers preschool&stores and click select {string} in the submenu")
	public void he_hovers_preschool_stores_and_click_select_in_the_submenu(String string) {
		loginpage.hoverOverschool();
		loginpage.clickfindpreschool();
	
	}

	@When("he switches focus to new tab")
	public void he_switches_focus_to_new_tab() {
	   ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	}

	@When("he click on the second available city")
	public void he_click_on_the_second_available_city() {
	   
	    sp.clicklocator();
	 }

	@When("click on findmy preschool")
	public void click_on_findmy_preschool() throws InterruptedException, IOException {

	String[][] data=ReadExcel.getData("resources//TestData.xlsx", "sheet1");
	for(int i=1;i<2;i++) {
	String city= data[i][1];

	Thread.sleep(3000);	 
	fp.selectCity(city);
	fp.clickfind();

	}
	}
	
	 @Then("he must be able to  verify the text {string}")
	public void he_must_be_able_to_verify_the_text(String string){
	    	
		String expectedText ="FirstCry Intellitots Preschool Locator";
		String actualText = vt.getText();
		Assert.assertEquals(actualText, expectedText);
			}
	    
	
	}	
	