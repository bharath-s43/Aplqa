package Applause_Qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty"},
		features = {"src/test/java/Applause_Qa/2ApplauseTest2.feature","src/test/java/Applause_Qa/3ApplauseTest3.feature","src/test/java/Applause_Qa/4CustomerAdmin1.feature"}
		)

public class TestRunner {
	
	

}

