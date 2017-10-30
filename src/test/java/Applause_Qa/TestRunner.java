package Applause_Qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty"},
		features = {"src/test/java/Applause_Qa/1bApplauseTest.feature","src/test/java/Applause_Qa/1cApplauseTest.feature","src/test/java/Applause_Qa/2aCustomerAdmin.feature","src/test/java/Applause_Qa/2bCustomerAdmin.feature","src/test/java/Applause_Qa/2cCustomerAdmin.feature","src/test/java/Applause_Qa/3aBrandAdmin.feature","src/test/java/Applause_Qa/3bBrandAdmin.feature","src/test/java/Applause_Qa/3cBrandAdmin.feature","src/test/java/Applause_Qa/4aLocationAdmin.feature","src/test/java/Applause_Qa/4bLocationAdmin.feature","src/test/java/Applause_Qa/4cLocationAdmin.feature"}
		)

public class TestRunner {
	

}

