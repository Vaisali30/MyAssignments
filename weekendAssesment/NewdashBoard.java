package weekendAssesment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class NewdashBoard {

	public static void main(String[] args) throws InterruptedException{
		
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
		
		//Click on the toggle menu button from the left corner
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	    //Click View All and click Dashboards from App Launcher
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
	    search.sendKeys("Dashboards");
	    driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();
	    
	    //Click on the New Dashboard option 
	    driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	    
	   
	    //Enter Name as 'Salesforce Automation by Your Name
	    WebElement name = driver.findElement(By.xpath("(//div[@class='slds-form-element__control']/input)[1]"));
	    name.sendKeys("Salesforce Automation by Vaishu");
	    Thread.sleep(5000);
	    
	    
	    	    
		
		

	}

}
