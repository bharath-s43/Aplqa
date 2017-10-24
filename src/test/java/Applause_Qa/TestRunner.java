package Applause_Qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty"},
		features = {"src/test/java/Applause_Qa/2ApplauseTest2.feature","src/test/java/Applause_Qa/3ApplauseTest3.feature","src/test/java/Applause_Qa/4CustomerAdmin1.feature","src/test/java/Applause_Qa/5CustomerAdmin2.feature","src/test/java/Applause_Qa/6CustomerAdmin3.feature","src/test/java/Applause_Qa/7BrandAdmin1.feature","src/test/java/Applause_Qa/8BrandAdmin2.feature","src/test/java/Applause_Qa/9BrandAdmin3.feature"}
		)

public class TestRunner {
	

}

