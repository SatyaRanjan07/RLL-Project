package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "stepDefinations",
//		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
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

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}