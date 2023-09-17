package pageFactory;

import java.time.Duration;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	Actions actions;
	private WebDriverWait wait;
	
	@FindBy(xpath="(//span[contains(@class,'anch')])[2]")
	private WebElement storesandpreschools;
	
	@FindBy(linkText="Find Stores")
	private WebElement clickfindstores;
	
	@FindBy(id = "search_box")
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[contains(@class,'search-button')]")
	private WebElement searchBTN;
	
	@FindBy(xpath = "//li[contains(@class,'logreg')]")
	private WebElement goToLogIn;
	
	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div[1]/a/img")
	private WebElement firstCryText;
	
	@FindBy(xpath = "//span[contains(@class,'anch myacc_2')]")
	private WebElement myAccText;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void searchItem(String s) throws InterruptedException {
		Thread.sleep(2000);
		searchBox.click();
		searchBox.sendKeys(s);
		searchBTN.click();
	}
	
	public void goToLogInPage() {
		goToLogIn.click();
	}
	
	public void StoresAndPreschools() {
		wait.until(ExpectedConditions.visibilityOf(storesandpreschools));
		actions.moveToElement(storesandpreschools).build().perform();
	}
	
	public void clickFindStores() {
		wait.until(ExpectedConditions.visibilityOf(storesandpreschools));
		clickfindstores.click();
	}
	
	public void comeToHomePage() {
		firstCryText.click();
	}
	
	public String getMyaccText() {
		return myAccText.getText();
	}
	
}
