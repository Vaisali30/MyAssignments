package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Accenture");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName")); 
		firstName.sendKeys("Vaishali");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName")); 
		lastName.sendKeys("Sowmiyan");
		
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Vaishu");
		
		WebElement lastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastNameLocal.sendKeys("foodie");

		
		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Miss");
		
		
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("Testing");
		
		WebElement descriptionBox = driver.findElement(By.id("createLeadForm_description"));
		descriptionBox.sendKeys("Automation Testing is used to write and execute the TestScripts with the help of tools");
		
		WebElement phoneNumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phoneNumber.sendKeys("9655148632"); 
		
		WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("vaishalisowmiyan2000@gmail.com"); 
		
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit")); 
		createLeadButton.click();                                                            
		
	    Thread.sleep(3000);    
	    driver.close();                                                                      
		
		
		
	}

}
