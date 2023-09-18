package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(xpath = "//span[contains(@class,'M14_61 pos-rel')]")
	private WebElement CartBtn;
	
	@FindBy(xpath = "//span[contains(@class,'M15_21 removetext')]")
	private WebElement RemoveBtn;
	
	@FindBy(xpath = "//p[contains(@class,'M20_42 cart-empty-text')]")
	private WebElement cartMassege;
	
	@FindBy(xpath= "//span[contains(@class,'quantity-icon')]")
	 private WebElement quantity;
		
	@FindBy(xpath = "//div[contains(@class,'qty_popup-value')][2]")
	private WebElement qtyTWO;
	
	public CartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

  }
	
	public void Cart() {
		CartBtn.click();
	}
	
	public void Remove() throws InterruptedException {

		Thread.sleep(6000);

		RemoveBtn.click();
		
	}
	
	
	public String getMassege() throws InterruptedException {
		Thread.sleep(5000);

		return cartMassege.getText();

	}
	
	public void quantityBTN() throws InterruptedException {
		
		Thread.sleep(5000);
		quantity.click();
	}
	
	public void qtyTWOBTN() throws InterruptedException {
		Thread.sleep(5000);
		qtyTWO.click();
	}

}
