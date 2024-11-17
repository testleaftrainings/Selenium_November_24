package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	
		//InvalidSelectorException- doing mistake in syntax
		//Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector
		//from javascript error: {"status":32,"value":"Unable to locate an element with the xpath expression //input[@id='username' because of the following error:\nSyntaxError: Failed to execute 'evaluate' on 'Document': The string '//input[@id='username'' is not a valid XPath expression."}
		  
	
	}

}
