package week5.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
							//Frame1
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("Click"));
		ele.click();
		String text = ele.getText();			//to get that text that presented on tht button after clicked that
		System.out.println(text);
		driver.switchTo().defaultContent();    //Control move to out of the frame or main web page
		
						    //Frame3
		driver.switchTo().frame(3);
		WebElement nested = driver.findElement(By.xpath("//button[text()='Click Me']"));
		nested.click();
		String text2 = nested.getText();
		System.out.println(text2);
		driver.switchTo().defaultContent();
		
	}

}
