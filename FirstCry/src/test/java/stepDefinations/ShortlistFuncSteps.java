package stepDefinations;

import java.util.ArrayList;

import pageFactory.DeleteProducts;
import pageFactory.FewProductShortlist;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShortlistFuncSteps extends Driver  {

	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	
	}

	@When("I log in with valid credentials")
	public void i_log_in_with_valid_credentials() throws InterruptedException{
		landingpage.goToLogInPage();
	    loginpage.login();
	    Thread.sleep(2000);
	    loginpage.clickOnCont();
	    loginpage.clickOnSubmitBTN();
	  }
	

	@When("I shortlist a few products")
	public void i_shortlist_a_few_products()  {
	 s = new FewProductShortlist(driver);
		s.Search("Girl fashion");
		s.Searchicon();
		s.Hoveroverproduct();
}
	
	
	@When("I click on the Shortlist button")
	public void i_click_on_the_shortlist_button() throws InterruptedException {
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		s.shortlistsymbol();
		Thread.sleep(2000);
		loginpage.clickMyShortlistbutton();
		Thread.sleep(2000);

	}

	@Then("the selected products should be in my Shortlist")
	public void the_selected_products_should_be_in_my_shortlist() throws InterruptedException {	   
		DeleteProducts d = new DeleteProducts(driver);
		d.productdelete();
		driver.switchTo().alert().accept();
		
	}

}
