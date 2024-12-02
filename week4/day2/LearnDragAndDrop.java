package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement scr = driver.findElement(By.id("form:drag"));
		
		WebElement trgt = driver.findElement(By.id("form:drop"));
		
		
		Actions act= new Actions(driver);
		act.dragAndDrop(scr, trgt).perform();
		
	
	}
}
