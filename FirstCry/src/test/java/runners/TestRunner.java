package runners;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "stepDefinations",
		monochrome = true
//		tags = "@TC_001"
//		tags = "@BhoomikaBS"
//		tags = "@Arun"
//		tags = "@BhoomikaShetty"
//		tags = "@VishnuPriya"
//		tags = "@Swapnil"
//		tags = "@AkashJ"
//		tags = "@Rani"
		)
@Listeners(com.Listeners.TestListener.class)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}