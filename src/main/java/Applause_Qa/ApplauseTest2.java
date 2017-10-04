package Applause_Qa;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class ApplauseTest2 {
	
	WebDriver driver = ApplauseTest1.getdriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@Then("^user enters all other customer fields$")
	public void user_enters_all_other_customer_fields(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.xpath("//textarea [@ng-model='company.add']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("cpname")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("cpemail")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("cptel")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("caname")).sendKeys(data.get(4).get(1));
		driver.findElement(By.name("caemail")).sendKeys(data.get(5).get(1));
		driver.findElement(By.name("catel")).sendKeys(data.get(6).get(1));
	}
	@Then("^user enters all other brand fields$")
	public void user_enters_all_other_brand_fields(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		jse.executeScript("scroll(0, -450);");
		driver.findElement(By.id("fileLogo")).click();
		Runtime.getRuntime().exec("Images/The Ritz Carlton.exe");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("br")));
		driver.findElement(By.id("br")).clear();
		driver.findElement(By.id("br")).clear();
		driver.findElement(By.id("br")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("bg")).clear();
		driver.findElement(By.id("bg")).clear();
		driver.findElement(By.id("bg")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("bb")).clear();
		driver.findElement(By.id("bb")).clear();
		driver.findElement(By.id("bb")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("ba")).clear();
		driver.findElement(By.id("ba")).clear();
		driver.findElement(By.id("ba")).sendKeys(data.get(3).get(1));
		driver.findElement(By.id("fr")).clear();
		driver.findElement(By.id("fr")).sendKeys(data.get(4).get(1));
		driver.findElement(By.id("fg")).clear();
		driver.findElement(By.id("fg")).sendKeys(data.get(5).get(1));
		driver.findElement(By.id("fb")).clear();
		driver.findElement(By.id("fb")).sendKeys(data.get(6).get(1));
		driver.findElement(By.id("fa")).clear();
		driver.findElement(By.id("fa")).sendKeys(data.get(7).get(1));
		driver.findElement(By.name("bpname")).sendKeys(data.get(8).get(1));
		driver.findElement(By.name("bpemail")).sendKeys(data.get(9).get(1));
		driver.findElement(By.name("bptel")).sendKeys(data.get(10).get(1));
		driver.findElement(By.name("baname")).sendKeys(data.get(11).get(1));
		driver.findElement(By.name("baemail")).sendKeys(data.get(12).get(1));
		driver.findElement(By.name("batel")).sendKeys(data.get(13).get(1));
		driver.findElement(By.xpath("//input [@ng-model='brand.empPersPref']")).sendKeys(data.get(14).get(1));
		
		
	}
	
	@Then("^user enters all other location fields$")
	public void user_enters_all_other_location_fields(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("majorMinor")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("locImg")).click();
		Runtime.getRuntime().exec("Images/Marina Del Rey.exe");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("latitude")));
		driver.findElement(By.name("latitude")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("longitude")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("lradius")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("pname")).sendKeys(data.get(4).get(1));
		driver.findElement(By.name("pemail")).sendKeys(data.get(5).get(1));
		driver.findElement(By.name("pcontact")).sendKeys(data.get(6).get(1));
		driver.findElement(By.name("pemailf")).click();
		driver.findElement(By.name("psmsf")).click();
		driver.findElement(By.name("aname")).sendKeys(data.get(7).get(1));
		driver.findElement(By.name("aemail")).sendKeys(data.get(8).get(1));
		driver.findElement(By.name("acontact")).sendKeys(data.get(9).get(1));
		driver.findElement(By.name("aemailf")).click();
		driver.findElement(By.name("asmsf")).click();
		}
	
	@Then("^user enters all other employee fields$")
	public void user_enters_all_other_employee_fields(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("contact")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("fileImg")).click();
		Runtime.getRuntime().exec("Images/Aamir Khan.exe");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("dept")));
		driver.findElement(By.name("dept")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("empPref")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("sdate")).sendKeys(data.get(4).get(1));
	}
}
