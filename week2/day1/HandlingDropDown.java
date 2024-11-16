package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dropDown = driver.findElement(By.className("ui-selectonemenu"));
		
		//create object for select class
		Select opt=new Select(dropDown);
		//opt.selectByIndex(3);
		
		//opt.selectByValue("");
		
		opt.selectByVisibleText("Playwright");
		
		
		//non- select tag
		
		driver.findElement(By.id("j_idt87:country_label")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt87:country_2")).click();
		
		
	}

}
