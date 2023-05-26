import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Select a UI tool 
		WebElement selectTool = driver.findElement(By.className("ui-selectonemenu"));
		Select select1=new Select(selectTool);
		select1.selectByVisibleText("Selenium");
		
		
		//country text box
		WebElement countryTextBox = driver.findElement(By.id("j_idt87:country_label"));
	    countryTextBox .click();
	  
	    WebElement preferredCountry = driver.findElement(By.id("j_idt87:country_3"));
	    preferredCountry.click();

	    //  select Cities 
	    WebElement selectCities = driver.findElement(By.xpath("//label[text()='Select City']"));
	    selectCities.click();
	    
	    WebElement preferredCity = driver.findElement(By.xpath("//li[text()='Chennai']"));
	    preferredCity.click();

	    // select Course 
	    WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
	    course.sendKeys("Selenium WebDriver");
	    
	    WebElement selectedCourse = driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']"));
	    selectedCourse.click();
	   

	    //randomly
	    WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
	    language.click();
	    
	    WebElement randomlyLanguage = driver.findElement(By.xpath("//li[text()='English']"));
	    randomlyLanguage.click();
	  
	    // irrespective  language
	    WebElement irrespectiveLanguage = driver.findElement(By.id("j_idt87:value_label"));
	    irrespectiveLanguage.click();
	    
	    WebElement languageSelected = driver.findElement(By.xpath("//li[text()='one']"));
	    languageSelected.click();

	    
	    
	     driver.close();
	}

}
