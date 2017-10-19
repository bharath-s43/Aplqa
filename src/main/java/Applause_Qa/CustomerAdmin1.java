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
	
	@When("^user click on the Add new button1$")
	public void user_click_on_the_Add_new_button1() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add New')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
	}
	
	@Then("^selects the rating image1$")
	public void selects_the_rating_image1() throws Throwable {
		jse.executeScript("scroll(0, 450);");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ratingSelect")));
		Select rating_image = new Select(driver.findElement(By.id("ratingSelect")));
		rating_image.selectByVisibleText("Star");
	}
	
	@Then("^clicks on Assign individual button1$")
	public void clicks_on_Assign_individual_button1() throws Throwable {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@ng-click='goToAssign()']")));
			driver.findElement(By.xpath("//a [@ng-click='goToAssign()']")).click();
	}
	
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

	


}
