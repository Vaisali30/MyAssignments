package weekendAssesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("  https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.name("city"));
		Thread.sleep(1000);
		Select cityChennai = new Select(city);
		cityChennai.selectByVisibleText("Chennai");
		
		WebElement generic = driver.findElement(By.name("genre"));
		Thread.sleep(1000);
		Select animation = new Select(generic);
		animation.selectByVisibleText("ANIMATION");
		
		WebElement language = driver.findElement(By.name("lang"));
		Select english = new Select(language);
		english.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']//div[1])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement name = driver.findElement(By.id("cinemaName"));
		Select cinemaName = new Select(name);
		cinemaName.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		WebElement time = driver.findElement(By.name("timings"));
		Select showtime = new Select(time);
		showtime.selectByVisibleText("09:00 AM - 12:00 PM");
		
		
	}

}
