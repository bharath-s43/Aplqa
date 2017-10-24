package Applause_Qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerAdmin1 {

	
	WebDriver driver = ApplauseTest1.getdriver();
	By loadingImage = By.xpath("//div [@ng-hide='loaded']");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@When("^user logout of the portal$")
	public void user_logout_of_the_portal() throws Throwable {
		driver.findElement(By.xpath("//div[@data-toggle='dropdown']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	@Then("^click on delete$")
	public void click_on_delete() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Delete')]")).click();
	}

	


}
