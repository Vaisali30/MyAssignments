package weekendAssesment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesIndividuals {

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
		
		//Click on the toggle menu button from the left corner
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    Thread.sleep(5000);
	    
	    //Click View All and click Individuals from App Launcher
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
	    search.sendKeys("Individuals");
	    driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
	    
	    //Click on New Individual 
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    
	    //Enter the Last Name as 'Kumar'
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kumar");
	    
	    //Click save
	    driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	    
	    String titleIndividual = driver.getTitle();
	    System.out.println(titleIndividual);
	    //verify Individuals Name
	    if(search.equals(titleIndividual)) {
	    	System.out.println("both are same");
	    }else {
	    	System.out.println("both are not same");
	    }
	}

}
