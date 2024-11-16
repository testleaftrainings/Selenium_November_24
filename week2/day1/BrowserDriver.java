package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserDriver {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//return type for findElement()-> WebElement
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		user.clear();
		user.sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//NoSuchElementException- when you have mismatch the attribute and attribute class
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("RM")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	
	
	}

	
}
