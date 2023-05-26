package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/select.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  
	    WebElement selectTool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
	    Select UiTool = new Select(selectTool);
	    UiTool.selectByVisibleText("Selenium");
	    
        
	    WebElement countryBox = driver.findElement(By.id("j_idt87:country_label"));
	    countryBox .click();
	  
	    WebElement preferredCountry = driver.findElement(By.id("j_idt87:country_3"));
	    preferredCountry.click();
	  

	  
	    WebElement selectCity= driver.findElement(By.xpath("//label[text()='Select City']"));
	    selectCity.click();
	    
	    WebElement preferredCity = driver.findElement(By.xpath("//li[text()='Chennai']"));
	    preferredCity.click();

	    
	    WebElement courseBox = driver.findElement(By.id("j_idt87:auto-complete_input"));
	    courseBox.sendKeys("Selenium WebDriver");
	    
	    WebElement selectedCourse = driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']"));
	    selectedCourse.click();
	   

	    
	    WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
	    language.click();
	    
	    WebElement chosenLanguage = driver.findElement(By.xpath("//li[text()='English']"));
	    chosenLanguage.click();
	  
	    
	    WebElement twoLanguage = driver.findElement(By.id("j_idt87:value_label"));
	    twoLanguage.click();
	    
	    WebElement languageSelected = driver.findElement(By.xpath("//li[text()='one']"));
	    languageSelected.click();

	    
	    driver.close();	
	
	
	}

}
