package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWaits {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Get Started']")).click();
		
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Home")) {
			System.out.println("Title is printed");
		}else {
			System.out.println("Title is not printed");
		}
		
		
		//get text application
		
		/*
		 * String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 * System.out.println(text); if(text.contains("Dilip")) {
		 * System.out.println("lead is created"); }else {
		 * System.out.println("lead is not created"); }
		 */
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		driver.close();
		
	}

}
