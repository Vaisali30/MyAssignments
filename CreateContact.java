package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
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
		
		WebElement contactButton = driver.findElement(By.linkText("Contacts"));
		contactButton.click();
		
		WebElement createContactButton = driver.findElement(By.linkText("Create Contact"));
		createContactButton.click();
		
		WebElement firstName = driver.findElement(By.id("firstNameField")); 
		firstName.sendKeys("Vaishali");
		
		WebElement lastName = driver.findElement(By.id("lastNameField")); 
		lastName.sendKeys("Sowmiyan");
		
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Vaishu");
		
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("Sowmiyan");
	
		WebElement departName = driver.findElement(By.id("createContactForm_departmentName"));
		departName.sendKeys("Testing");
	
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("It involves execution of software/system components using manual or automated tools to evaluate one or more properties of interest. ");
	
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("vaishufoodie30@gmail.com");
	
		WebElement stateOrProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select state=new Select(stateOrProvince) ;
        state.selectByVisibleText("New York");
	
        WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
        
		WebElement edit = driver.findElement(By.className("subMenuButton"));
		edit.click();
		
		WebElement clearDes = driver.findElement(By.id("updateContactForm_description"));
		clearDes.clear();
		
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("Thank you for choosing out testleaf");
		
		WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		
		System.out.println(driver.getTitle());
        
	
	}
	
	

}
