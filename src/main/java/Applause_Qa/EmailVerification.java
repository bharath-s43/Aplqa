package Applause_Qa;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailVerification {
	
	public static WebDriver driver = null;
	
	public static void mailVerify(String Email, String Password) throws Throwable {
		
		
	System.setProperty("webdriver.chrome.driver","Tools/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/gmail/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("identifier")).sendKeys(Email);
	driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	driver.findElement(By.name("password")).sendKeys(Password);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Next')]")));
	driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
	String web = "//span[@class='bog']/b[contains(text(),'Applause Activation')]";
	//String web = "//span[text()='Excellent! Please verify your BioLert account to complete the signup.']";
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(web)));
	driver.findElement(By.xpath(web)).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> email = driver.findElements(By.xpath("//div[@class='gs']/div[7]/div[1]"));
	System.out.println(email.size());
	for(int i =0;i<email.size();i++){
		System.out.println(email.get(i));
		if(i==email.size()-1){
			System.out.println("anadadnad"+email.get(i));
			//String [] path = email.get(i).getText().split("\\n");
		
			driver.findElement(By.xpath("//a[contains(text(), 'Verify Email')]")).click();
			
		    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			driver.findElement(By.name("password")).sendKeys("abcd123");
			driver.findElement(By.name("cpassword")).sendKeys("abcd123");
			ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Submit')]"));
			driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
			driver.quit();
			
		}
	}	
}
	
}
