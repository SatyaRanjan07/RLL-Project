package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyingtext {
	@FindBy(xpath = "/html/body/section[2]/div/div/div/div[1]/h1")
	private WebElement verifytext;
	
	public verifyingtext(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	public String getText() {
		String text=verifytext.getText() ;
return text;
}

}