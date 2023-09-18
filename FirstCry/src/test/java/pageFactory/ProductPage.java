package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath = "//a[contains(@title,'Spiky 100% Accuracy Silicone Spiky Sporty Analogue Watch Bunny Design - Pink   ')]")
	private WebElement watchesFirstItem;
	
	@FindBy(xpath = "//a[contains(@title,'Kookie Kids Full Sleeves Padded Hooded Winter Jacket Solid Coloured - Black')]")
	private WebElement jacketsFirstItem;
	
	@FindBy(xpath = "//a[contains(@title,'Pine Kids 100% Cotton Roll Up Full Sleeves Checkered Shirt with Inner Tee - Blue')]")
	private WebElement shirtsFirstItem;
	
	@FindBy(xpath = "//a[contains(@title,'Babyhug Full Length Stretchable Cotton Corduroy Joggers Spec Embroidery-Khaki')]")
	private WebElement pantsFirstItem;
	
	@FindBy(xpath = "//div[contains(@class,'lblock lft')]")
	private WebElement firstItem;

	
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfWatchesFirstItem() {
		return watchesFirstItem.getText();
	}
	
	public String getTitleOfJacketsFirstItem() {
		return jacketsFirstItem.getText();
	}
	
	public String getTitleOfShirtsFirstItem() {
		return shirtsFirstItem.getText();
	}
	
	public String getTitleOfPantsFirstItem() {
		return pantsFirstItem.getText();
	}
	public String getTitleOfFirstItem() {

		return firstItem.getText();
		//driver.getWindowHandles();

	}
	
}
