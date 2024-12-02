package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement sd = driver.findElement(By.linkText("Blog"));
		
		Actions obj=new Actions(driver);
		
		obj.scrollToElement(sd).perform();
		
		
		Thread.sleep(2000);
		sd.click();
		
		
	}

}
