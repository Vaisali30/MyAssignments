package week4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		
		driver.manage().window().maximize();
		
		 WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
		 profile.click();   
		 Select matriProfile=new Select(profile) ;
		  matriProfile.selectByValue("1");
			
		    driver.findElement(By.name("NAME")).sendKeys("Vaishali");
		    
		    WebElement gender = driver.findElement(By.xpath("//label[@for='genderfemale']"));
		    gender.click();
		    
		    WebElement date = driver.findElement(By.id("DOBDAY"));
		    Select birthDate=new Select(date) ;
		    birthDate.selectByValue("30");
		    
		    WebElement month = driver.findElement(By.id("DOBMONTH"));
		    Select birthMonth=new Select(month) ;
		    birthMonth.selectByValue("6");
		    
		    WebElement year = driver.findElement(By.id("DOBYEAR"));
		    Select birthYear=new Select(year) ;
		    birthYear.selectByValue("2000");
		    
		    
		    WebElement religion = driver.findElement(By.id("RELIGION"));
			 religion.click();   
			 Select clickReligion=new Select(religion) ;
			 clickReligion.selectByValue("1");
		    
			 WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
			 religion.click();
			 Select clickMotherTongue=new Select(motherTongue) ;
			 clickMotherTongue.selectByValue("48");
		    
			 WebElement country = driver.findElement(By.id("COUNTRY"));
			 country.click();
			 Select clickCountry=new Select(country) ;
			 clickCountry.selectByValue("98");
		    
			 driver.findElement(By.id("MOBILENO")).sendKeys("6369831372");
			 
			 driver.findElement(By.name("EMAIL")).sendKeys("vaishalisowmiyan2000@gmail.com");
			 
			 driver.findElement(By.name("PASSWD1")).sendKeys("vaishufoodie30");
		    
			 driver.close();
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
