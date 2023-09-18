package stepDefinations;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

import pageFactory.FindStorePage;
import pageFactory.AddToCartPage;
import pageFactory.CartPage;
import pageFactory.DeleteProducts;
import pageFactory.EditAddressBook;
import pageFactory.FewProductShortlist;
import pageFactory.HoverMouse;
import pageFactory.LandingPage;
import pageFactory.LogInPage;
import pageFactory.ProductPage;
import pageFactory.findingpage;
import pageFactory.searchingpage;
import pageFactory.verifyingtext;

public class Driver extends Tools {
	
	
	public static Logger logger;

	protected static LandingPage landingpage;
	protected static LogInPage loginpage;
	protected static ProductPage Productpage;
	protected static HoverMouse hovermouse;
	protected static EditAddressBook addressBook;
	protected static FindStorePage Findstorepage;
	protected static FewProductShortlist s;
	protected static DeleteProducts d;
	protected static searchingpage sp;
	protected static findingpage fp;
	protected static verifyingtext vt;
	protected static CartPage cartpage;
	protected static AddToCartPage addToCartPage;
	
	public static void init() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\chromedriver-win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.firstcry.com/");
		  landingpage = new LandingPage(driver);
		  loginpage = new LogInPage(driver);
		  Productpage = new ProductPage(driver);
		  hovermouse = new HoverMouse(driver);
		  addressBook = new EditAddressBook(driver);
		  Findstorepage = new FindStorePage(driver);
		  s = new FewProductShortlist(driver);
		  d = new DeleteProducts(driver);
		  sp = new searchingpage(driver);
		  fp =new findingpage(driver);
		  vt = new verifyingtext(driver);
		  cartpage = new CartPage(driver);
		  addToCartPage = new AddToCartPage(driver);
		  
		  logger = Logger.getLogger("LogDemo");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);

	}

}
