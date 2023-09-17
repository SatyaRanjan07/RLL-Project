package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchingpage {
	
	private Actions actions;
	@FindBy(linkText = "Preschool Locator")
	private WebElement locator;
	
	
	public searchingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		actions = new Actions(driver);
	}

public void clicklocator() {
		locator.click();
		}



}
