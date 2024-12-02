package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		
		WebElement mouseOver = driver.findElement(By.xpath("//a[text()='Men']"));
		
		//Object for Actions class
		Actions builder=new Actions(driver);
		
		//ObjectName.methodName();
		builder.moveToElement(mouseOver).perform();
		
		//.perform()- without perform() action will not complete
		
	}

}
