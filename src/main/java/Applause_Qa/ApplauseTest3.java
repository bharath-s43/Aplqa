package Applause_Qa;


import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;



public class ApplauseTest3 {
	
	WebDriver driver = ApplauseTest1.getdriver();
	By loadingImage = By.xpath("//div [@ng-hide='loaded']");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@Then("^user clicks on the bulk action$")
	public void user_clicks_on_the_bulk_action() throws Throwable {
		Thread.sleep(2000);
		jse.executeScript("scroll(0, -250);");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Bulk Action')]")));
		driver.findElement(By.xpath("//button[contains(text(), 'Bulk Action')]")).click();
	}

	@Then("^user clicks on the assign link$")
	public void user_clicks_on_the_assign_link() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Assign')]")));
		driver.findElement(By.xpath("//a[contains(text(), 'Assign')]")).click();
	}

	@Then("^upload the csv file to Assign Beacons$")
	public void upload_the_csv_file_to_Assign_Beacons() throws Throwable {
		Thread.sleep(2000);
		String dirPath = System.getProperty("user.dir");

		// Specify the file location with extension
		StringSelection sel = new StringSelection(dirPath+"\\CSV\\beacon_assign.csv");

		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		driver.findElement(By.id("beaconCSV")).click();
		FileUpload.uploadFile();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}
	
	@Then("^click on the Add in bulk button$")
	public void click_on_the_Add_in_bulk_button() throws Throwable {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Add in bulk')]")));
		driver.findElement(By.xpath("//a[contains(text(), 'Add in bulk')]")).click();
	}

	@Then("^upload the csv file to Employee details$")
	public void upload_the_csv_file_to_Employee_details() throws Throwable {
String dirPath = System.getProperty("user.dir");
		
		// Specify the file location with extension
		  StringSelection sel = new StringSelection(dirPath+"\\CSV\\employee_bulk.csv");
		  
		  // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("empCSV"))); 
			driver.findElement(By.id("empCSV")).click();
			 
			FileUpload.uploadFile();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}

	@Then("^upload the zip file to images$")
	public void upload_the_zip_file_to_images() throws Throwable {
String dirPath = System.getProperty("user.dir");
		
		// Specify the file location with extension
		  StringSelection sel = new StringSelection(dirPath+"\\Images\\profile_images.zip");
		  
		  // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			 driver.findElement(By.id("empImgBulk")).click();
			 
			 FileUpload.uploadFile();
			 Thread.sleep(2000);
			 
				
	}
	
	@Then("^user clicks on the Pair link$")
	public void user_clicks_on_the_Pair_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Pair')]")).click();
	}

	@Then("^upload the csv file to Pair Beacons$")
	public void upload_the_csv_file_to_Pair_Beacons() throws Throwable {
String dirPath = System.getProperty("user.dir");
		
		// Specify the file location with extension
		  StringSelection sel = new StringSelection(dirPath+"\\CSV\\beacon_pair.csv");
		  
		  // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("beaconCSV")));
			 driver.findElement(By.id("beaconCSV")).click();
			 
			 FileUpload.uploadFile();
		
				wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}
	
	@Then("^user clicks on the Unpair link$")
	public void user_clicks_on_the_Unpair_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Unpair')]")).click();
	}

	@Then("^upload the csv file to Unpair Beacons$")
	public void upload_the_csv_file_to_Unpair_Beacons() throws Throwable {
String dirPath = System.getProperty("user.dir");
		
		// Specify the file location with extension
		  StringSelection sel = new StringSelection(dirPath+"\\CSV\\beacon_unpair.csv");
		  
		  // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("beaconCSV")));
			 driver.findElement(By.id("beaconCSV")).click();
			 
			 FileUpload.uploadFile();
		
				wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}
	
	@Then("^user clicks on the Unassign link$")
	public void user_clicks_on_the_Unassign_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Unassign')]")).click();
	}

	@Then("^upload the csv file to Unassign Beacons$")
	public void upload_the_csv_file_to_Unassign_Beacons() throws Throwable {
String dirPath = System.getProperty("user.dir");
		
		// Specify the file location with extension
		  StringSelection sel = new StringSelection(dirPath+"\\CSV\\beacon_assign.csv");
		  
		  // Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 System.out.println("selection" +sel);
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("beaconCSV")));
			 driver.findElement(By.id("beaconCSV")).click();
			 
			 FileUpload.uploadFile();
		
				wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}

}
