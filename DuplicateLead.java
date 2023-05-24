package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Get the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		//Enter the password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//Click Login
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		//Click crm/sfa link
		WebElement crmsfa = driver.findElement(By.id("label"));
		crmsfa.click();
       
		// Click Leads link
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
        leadButton.click();

        //	Click Find leads
        WebElement findlead = driver.findElement(By.linkText("Find Leads"));
        findlead.click();

        //	Click on Email
        WebElement email = driver.findElement(By.linkText("Email"));
        email.click();

        //	Enter Email
        WebElement typeEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
        typeEmail.sendKeys("vaishalisowmiyan2000@gmail.com");

        //	Click find leads button
        WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findLeadButton.click();

        //	Capture name of First Resulting lead
        WebElement nameOfThe1stLead = driver.findElement(By.xpath("//a[text()='Vaishali'][1]"));
        String text = nameOfThe1stLead.getText();
        System.out.println(text);
     
        // Click First Resulting lead
        nameOfThe1stLead.click();

        

        // Click Duplicate Lead
        WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
        duplicate.click();

        //	Verify the title as 'Duplicate Lead'
        String title = driver.getTitle();
        System.out.println(title);
        if(title.contains("Duplicate Lead")){
        System.out.println("title is verified");
        	
        }

        //	Click Create Lead
        WebElement submit = driver.findElement(By.name("submitButton"));
        submit.click();

        //Confirm the duplicated lead name is same as captured name
        WebElement dName = driver.findElement(By.id("viewLead_firstName_sp"));
        String text1 = dName.getText();
        
        if(text1.equals(text)) {
        	System.out.println("both names are same");
        }
             
        //	Close the browser (Do not log out)
        driver.quit();


		
		
		
		
	}

}
