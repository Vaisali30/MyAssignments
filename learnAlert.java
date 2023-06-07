package week5.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
								
										//inspect show button
		
		driver.findElement(By.xpath("(//span[text()='Show'][1])")).click();		
		Alert alert = driver.switchTo().alert();			  //to change the mouse control to alert page
		
		alert.accept();			                              //to click ok button we can use accept method
		
		
											//confirm button
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		driver.switchTo().alert();
		alert.dismiss();
		
										//sweetalert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.switchTo().alert();
		
		WebElement dismiss = driver.findElement(By.id("j_idt88:j_idt98"));
		alert.dismiss();
		
									//promptalert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("vaishu");
		Thread.sleep(2000);
		System.out.println(prompt.getText());
		prompt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
