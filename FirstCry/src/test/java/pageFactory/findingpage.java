package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class findingpage {
	@FindBy(id="city")
	private WebElement citydropdown;
	
	@FindBy(xpath = "(//input[contains(@class,'view-schools')])")
	private WebElement findbtn;
	
	public findingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	public void selectCity(String city) {
	   Select select = new Select(citydropdown);
	   select.selectByVisibleText(city);
	   
	}
	public void clickfind() {
		findbtn.click();
	}
}
