package week4.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get( "https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement createButton = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
		createButton.click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Vaishali");
		
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Sowmiyan");
		
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("6369831372");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("vaish@30");
		
		
		WebElement day = driver.findElement(By.id("day"));
	    Select date=new Select(day) ;
        date.selectByIndex(29);
	
		
        WebElement month = driver.findElement(By.name("birthday_month"));
	    Select mon=new Select(month) ;
	    mon.selectByValue("10");
		
	    WebElement year = driver.findElement(By.id("year"));
	    Select birthYear =new Select(year) ;
        birthYear.selectByValue("2000");
        
        WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
        female.click();
	
	
	
	
	
	
	}

}
