package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
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
		
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		
		WebElement firstName = driver.findElement(By.id("ext-gen248"));
        firstName.sendKeys("Vaishali");
        
        WebElement FindLeadsButton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
        FindLeadsButton.click();
        
        WebElement firstLead = driver.findElement(By.xpath("(//a[text()='hareeharan'])[1]"));
        firstLead.click();
        
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        if(pageTitle.contains("View Lead")) {
			System.out.println("title is verified");
		}else {
			System.out.println("title is NOT verified");
		}
       
        
        
        WebElement edit = driver.findElement(By.linkText("Edit"));
        edit.click();
      
        
        WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
        companyName.clear();
        companyName.sendKeys("leaftaps1000");
        
        
        WebElement update = driver.findElement(By.name("submitButton"));
        update.click();
        
        WebElement changedCompName = driver.findElement(By.id("viewLead_companyName_sp"));
        String text = changedCompName.getText();
        System.out.println(text);
       
        if(text.contains("leaftaps")) {
        	System.out.println("Company Name is Verified");
			
		}else {
			System.out.println("Company Name is NOT Verified");
		}
        driver.quit();
}
}
