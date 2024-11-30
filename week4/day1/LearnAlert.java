package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myamcat.com/personal-information?source=myamcatNavigationBarNew");
		
		driver.findElement(By.id("bookNow")).click();
		Thread.sleep(3000);
		
		//handle the alert
		Alert alert = driver.switchTo().alert();
		
		//text from the alert box
		String text = alert.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		//handle simple alert
		//alert.accept();
		//alert.getText();
		//alert.dismiss();
		//alert.sendKeys("");
		driver.findElement(By.id("bookNow")).click();
		
		//exception 
		//alert.accept();
		//1. NoAlertPresentException
		//2. UnhandledAlertException
	}

}
