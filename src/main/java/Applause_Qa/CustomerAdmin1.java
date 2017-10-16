package Applause_Qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;

public class CustomerAdmin1 {
	
	WebDriver driver = ApplauseTest1.getdriver();
	
	@Then("^select the brand$")
	public void select_the_brand() throws Throwable {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-grid-cell-contents']/div")));
		driver.findElement(By.xpath("//div[@class='ui-grid-cell-contents']/div")).click();
	}

	@Then("^click on delete$")
	public void click_on_delete() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Delete')]")).click();
	}

	@Then("^select the customer$")
	public void select_the_customer() throws Throwable {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-grid-cell-contents']/div")));
		driver.findElement(By.xpath("//div[@class='ui-grid-cell-contents']/div")).click();
	}

	@Then("^click on send invite$")
	public void click_on_send_invite() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Send Invite')]")).click();
	}

	@Then("^verify the email and set password$")
	public void verify_the_email_and_set_password() throws Throwable {
		EmailVerification.mailVerify();
	}


}
