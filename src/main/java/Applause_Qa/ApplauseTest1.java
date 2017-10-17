package Applause_Qa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ApplauseTest1 {

	public static WebDriver driver = null;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	By loadingImage = By.xpath("//div [@ng-hide='loaded']");
	

	@Given("^go to applause portal$")
	public void go_to_applause_portal() throws Throwable {
		System.setProperty("webdriver.chrome.driver","Tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://applause-qa.appspot.com");
		driver.manage().window().maximize();   
	}

	@When("^user enters the email id and password$")
	public void user_enters_the_email_id_and_password(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));

	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
	}

	@Given("^user clicks on the customer menu$")
	public void user_clicks_on_the_customer_menu() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@ng-class='custClass']")));
		driver.findElement(By.xpath("//a [@ng-class='custClass']")).click();
	}

	@When("^user click on the Add new button$")
	public void user_click_on_the_Add_new_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add New')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
	}

	@Then("^user enters the customer name$")
	public void user_enters_the_customer_name(DataTable table) throws Throwable {
	
			List<List<String>> data = table.raw();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cname")));
			driver.findElement(By.name("cname")).sendKeys(data.get(0).get(1));
	}

	@And("^click on the save button$")
	public void click_on_the_save_button() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Save')]")).click();
		Thread.sleep(6000);

	}

	@Given("^user selects the customer from the customer dropdown$")
	public void user_selects_the_customer_from_the_customer_dropdown(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("custDropDown")));
		Select customer_dropdown = new Select(driver.findElement(By.id("custDropDown")));
		customer_dropdown.selectByVisibleText(data.get(0).get(1));

	}

	@When("^user clicks on the brand menu$")
	public void user_clicks_on_the_brand_menu() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@ng-class='brandClass']")));
		driver.findElement(By.xpath("//a [@ng-class='brandClass']")).click();
	}

	@Then("^user enters the brand name$")
	public void user_enters_the_brand_name(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("bname")));
		driver.findElement(By.name("bname")).sendKeys(data.get(0).get(1));
	}

	@Then("^selects the rating image$")
	public void selects_the_rating_image() throws Throwable {
		jse.executeScript("scroll(0, 450);");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ratingSelect")));
		Select rating_image = new Select(driver.findElement(By.id("ratingSelect")));
		rating_image.selectByVisibleText("Smiley");
	}

	@Given("^user selects the brand from the brand dropdown$")
	public void user_selects_the_brand_from_the_brand_dropdown(DataTable table) throws Throwable {
		Thread.sleep(4000);
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select [@ng-model='rootBrand']")));
		Select brnd_dropdown = new Select(driver.findElement(By.xpath("//select [@ng-model='rootBrand']")));
		brnd_dropdown.selectByVisibleText(data.get(0).get(1));

	}

	@When("^user clicks on the location menu$")
	public void user_clicks_on_the_location_menu() throws Throwable {
		driver.findElement(By.xpath("//a [@ng-class='locClass']")).click();
	}

	@Then("^user enters the location name$")
	public void user_enters_the_location_name(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lname")));
		driver.findElement(By.name("lname")).sendKeys(data.get(0).get(1));
	}

	@Then("^enters the address$")
	public void enters_the_address(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("laddress")).sendKeys(data.get(0).get(1));
	}

	@Given("^user selects the location from the location dropdown$")
	public void user_selects_the_location_from_the_location_dropdown(DataTable table) throws Throwable {
		Thread.sleep(2000);
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select [@ng-model='rootLocation']")));
		Select loc_dropdown = new Select(driver.findElement(By.xpath("//select [@ng-model='rootLocation']")));
		loc_dropdown.selectByVisibleText(data.get(0).get(1));
	}

	@When("^user clicks on the employee menu$")
	public void user_clicks_on_the_employee_menu() throws Throwable {
		driver.findElement(By.xpath("//a [@ng-class='empClass']")).click();
	}

	@Then("^user enters the employee first name and last name$")
	public void user_enters_the_employee_first_name_and_last_name(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("fname")));
		driver.findElement(By.name("fname")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("lname")).sendKeys(data.get(1).get(1));
	}

	@Then("^user enters the employee id and role$")
	public void user_enters_the_employee_id_and_role(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("empId")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("roleName")).sendKeys(data.get(1).get(1));
	}
	
	@When("^user clicks on the beacon menu$")
	public void user_clicks_on_the_beacon_menu() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@ng-class='beaconClass']")));
		driver.findElement(By.xpath("//a [@ng-class='beaconClass']")).click();
	}
	
	@Then("^clicks on Assign individual button$")
	public void clicks_on_Assign_individual_button() throws Throwable {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Assign Individual')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Assign Individual')]")).click();
	}

	@Then("^enters the beacon id$")
	public void enters_the_beacon_id(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("beaconId")));
		driver.findElement(By.name("beaconId")).sendKeys(data.get(0).get(1));
	}
	
	@Then("^selects the beacon id$")
	public void selects_the_beacon_id() throws Throwable {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-grid-cell-contents']/div")));
		driver.findElement(By.xpath("//div[@class='ui-grid-cell-contents']/div")).click();
	}

	@Then("^clicks on Pair individual button$")
	public void clicks_on_Pair_individual_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Pair Individual')]")));
		driver.findElement(By.xpath("//*[contains(text(), 'Pair Individual')]")).click();
	}

	@Then("^enters the employee id$")
	public void enters_the_employee_id(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@ng-model='beacon.empData']")));
		driver.findElement(By.xpath("//input [@ng-model='beacon.empData']")).sendKeys(data.get(0).get(1));
	}

	@Then("^click on search$")
	public void click_on_search() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Search')]")));
		driver.findElement(By.xpath("//*[contains(text(), 'Search')]")).click();
	}

	@And("^click on Pair button$")
	public void click_on_Pair_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'Pair')]")));
		driver.findElement(By.xpath("//label[contains(text(), 'Pair')]")).click();
	}
	
	@Then("^clicks the Unpair button$")
	public void clicks_the_Unpair_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Pair Individual')]/following-sibling::a[contains(text(),'Unpair')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Pair Individual')]/following-sibling::a[contains(text(),'Unpair')]")).click();
	}

	@Then("^clicks the Yes button$")
	public void clicks_the_Yes_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Yes')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
	}

	@Then("^clicks the Unassign button$")
	public void clicks_the_Unassign_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Assign Individual')]/following-sibling::a[contains(text(),'Unassign')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Assign Individual')]/following-sibling::a[contains(text(),'Unassign')]")).click();
	}

	
	public static WebDriver getdriver() {
		return driver;
	}

}
