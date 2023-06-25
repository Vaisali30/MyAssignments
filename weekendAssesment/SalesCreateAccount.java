package weekendAssesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//Login to https://login.salesforce.com 
		driver.get(" https://login.salesforce.com ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	    
		//Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    
		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    //Click on Accounts tab 
	    WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
	    js.executeScript("arguments[0].click();", element);
	    
	    //Click on New button 
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    
	    //Enter 'your name' as account name 
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("vaishu");
	    
	    //Select Ownership as Public
	    driver.findElement(By.xpath("(//span[text()='--None--'])[3]")).click();
     }

}
