package stepDefinations;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps extends Driver{
	
	@Given("a user is on the landing page of firstcry")
	public void a_user_is_on_the_landing_page_of_firstcry() {
		assertTrue(driver.getTitle().equals("Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com"));
		logger.info("ADDTOCART FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
	}
	@When("he type {string} and select the first option from the auto-complete box")
	public void he_type_and_select_the_first_option_from_the_auto_complete_box(String string) throws InterruptedException {

		addToCartPage.clicksearchIcon();
		addToCartPage.searchItem("Computer Accessories");	
	}
	@When("he click {string} button")
	public void he_click_button(String string) throws InterruptedException {
		addToCartPage.clickFirstItem();
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		//Use the list of window handles to switch between windows
		driver.switchTo().window((String) tabs.get(1));
		addToCartPage.clickAddToCartBtn();
	}
	@Then("he must see the text messsage {string} is displayed")
	public void he_must_see_the_text_messsage_is_displayed(String string) throws InterruptedException {
		addToCartPage.goToCart();
		String expectedText = "Portronics POR-704 Portable Laptop Stand with Cooling Fan - Grey";
	    String actualText = addToCartPage.getText();
	    Assert.assertEquals(actualText, expectedText);
	    logger.info("ADDTOCART FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
	}
}
