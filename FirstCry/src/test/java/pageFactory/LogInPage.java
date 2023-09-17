package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	private Actions actions;
	WebDriver wait;
	
	@FindBy(xpath = "(//span[contains(@class,'R12_61')])[2]")
	private WebElement preschool;
	
	@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[2]/a/span")
	private WebElement findpreschool;
	
	@FindBy(id = "lemail")
	private WebElement enterEmail;
	
	@FindBy(xpath = "//div[contains(@class,'btn-login-continue')]")
	private WebElement contBTN;
	
	@FindBy(id = "verfiedbtn")
	private WebElement submitBTN;
	
	@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[3]/ul/li[9]/a/span[2]")
	private WebElement myShortlistbutton;
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void login() {
		enterEmail.sendKeys("satya123zz@gmail.com");
//		enterEmail.sendKeys("bhumikashankar816@gmail.com");
	}
	
	public void clickOnCont() {
		contBTN.click();
	}
	
	public void clickOnSubmitBTN() throws InterruptedException {
		Thread.sleep(40000);
		submitBTN.click();
	}
	
	public  void clickMyShortlistbutton() {
		myShortlistbutton.click();
	}
	
	public void hoverOverschool() {
		actions.moveToElement(preschool).build().perform();
		}

	public void clickfindpreschool() {
		findpreschool.click();
	}

}
