package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    loginButton.click();
	
	    String pageTitle = driver.getTitle();
	    System.out.println("Homepage Title: "+pageTitle);
	    
	    
	    WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
		logOut.click();
		
		driver.close();

	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
