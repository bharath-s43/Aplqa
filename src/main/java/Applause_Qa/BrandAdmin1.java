package Applause_Qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;

public class BrandAdmin1 {
	
	WebDriver driver = ApplauseTest1.getdriver();
	
	@Then("^click on Admin switch$")
	public void click_on_Admin_switch() throws Throwable {
		driver.findElement(By.xpath("//div[@id='radioGroup']/label[2]")).click();
	}

}
