package stepDefinations;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFuncSteps extends Driver {
	
	@Given("a user is in the LandingPage on Firstcry")
	public void a_user_is_in_the_landing_page_on_firstcry() {
		assertTrue(driver.getTitle().equals("Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com"));
	}
	
	@When("he login")
	public void he_login() throws InterruptedException {
//		landingpage.goToLogInPage();
//	    loginpage.login();
//	    Thread.sleep(2000);
//	    loginpage.clickOnCont();
//	    loginpage.clickOnSubmitBTN();
		logger.info("SEARCH FUNCTIONALITY TEST STARTED");
	}


	@When("he search for Watches")
	public void he_search_for_watches() throws InterruptedException {
	   landingpage.searchItem("watches");
	}
	
	@When("he search for Jackets")
	public void he_search_for_jackets() throws InterruptedException {
		landingpage.searchItem("Jackets");
	}

	@When("he search for Shirts")
	public void he_search_for_shirts() throws InterruptedException {
		landingpage.searchItem("Shirts");
	}

	@When("he search for Pants")
	public void he_search_for_pants() throws InterruptedException {
		landingpage.searchItem("Pants");
	}


	@Then("he must be able to see the Silicone Spiky Sporty Analogue Watch item successfully.")
	public void he_must_be_able_to_see_the_silicone_spiky_sporty_analogue_watch_item_successfully() {
	  String actualValue = Productpage.getTitleOfWatchesFirstItem();
	  String expectedValue = "Spiky 100% Accuracy Silicone Spiky Sporty Analogue...";
	  Assert.assertEquals(actualValue, expectedValue);
	  landingpage.comeToHomePage();
			  
	}
	
	@Then("he must be able to see the Kookie Kids Full Sleeves Hoodie item successfully.")
	public void he_must_be_able_to_see_the_kookie_kids_full_sleeves_hoodie_item_successfully() {
		String actualValue = Productpage.getTitleOfJacketsFirstItem();
		  String expectedValue = "Kookie Kids Full Sleeves Padded Hooded Winter Jacket Solid...";
		  Assert.assertEquals(actualValue, expectedValue);
		  landingpage.comeToHomePage();
	   
	}

	@Then("he must be able to see the Pine Kids Cotton Roll Up Full Sleeves Check Shirt item successfully.")
	public void he_must_be_able_to_see_the_pine_kids_cotton_roll_up_full_sleeves_check_shirt_item_successfully() {
		String actualValue = Productpage.getTitleOfShirtsFirstItem();
		  String expectedValue = "Pine Kids 100% Cotton Roll Up Full Sleeves Checkered Shirt with...";
		  Assert.assertEquals(actualValue, expectedValue);
		  landingpage.comeToHomePage();
	}

	@Then("he must be able to see the Babyhug Denim Full Length Stretchable Washed Jogger item successfully.")
	public void he_must_be_able_to_see_the_babyhug_denim_full_length_stretchable_washed_jogger_item_successfully() {
		String actualValue = Productpage.getTitleOfPantsFirstItem();
		  String expectedValue = "Babyhug Full Length Stretchable Cotton Corduroy Joggers Spec...";
		  Assert.assertEquals(actualValue, expectedValue);
		  landingpage.comeToHomePage();
		  logger.info("SEARCH FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
	}

}
