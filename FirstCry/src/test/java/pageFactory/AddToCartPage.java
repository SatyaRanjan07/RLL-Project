package pageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(id = "search_box")
	private WebElement searchBox;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div[2]/div[4]/div[1]/div[3]/div[1]/div/div[1]/div[2]/a")
	private WebElement firstItem;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div[2]/div[5]/div/div[2]/div[2]/div[1]/div/span[1]/span")
	private WebElement addToCartBtn;
	
	@FindBy(id = "cart_TotalCount")
	private WebElement goToCart;
	
	@FindBy(xpath = "/html/body/form/div[4]/main/section[1]/div[2]/div[2]/div[1]/div[7]/div/div[1]/div[2]/span[1]/pro9509103")
	private WebElement productName;
	
	
	public AddToCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void clicksearchIcon() {
		searchBox.click();	
	}
	

	public void searchItem(String item) throws InterruptedException{
		searchBox.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(searchBox));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickFirstItem() throws InterruptedException {
		Thread.sleep(2000);
		firstItem.click();
	}
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}
	
	public void goToCart() throws InterruptedException {
		Thread.sleep(2000);
		goToCart.click();
	}

	public String getText() throws InterruptedException {
		Thread.sleep(2000);
		String message = productName.getText();
		return message;
	}

}
