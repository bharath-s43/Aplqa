package Applause_Qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty"},
		features = {"src/test/java/Applause_Qa/ApplauseTest2.feature","src/test/java/Applause_Qa/ApplauseTest3.feature","src/test/java/Applause_Qa/CustomerAdmin1.feature","src/test/java/Applause_Qa/CustomerAdmin2.feature","src/test/java/Applause_Qa/CustomerAdmin3.feature"}
		)

public class TestRunner {
	
	

}

