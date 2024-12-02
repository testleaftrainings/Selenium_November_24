package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptClick {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//p[text()='Service']")).click();
		WebElement js = driver.findElement(By.xpath("//span[text()='Accounts']"));
	    
	//JavascriptException
		//EelementClickInterceptorException
		driver.executeScript("arguments[0].click();", js);
		
	
		//step1 
				File scr = driver.getScreenshotAs(OutputType.FILE);
				
				//step 2- set path where snap need update
				File trg=new File("./snapShot/takeSnap1.png");
				
				//step 3- connect step1 & step2
				FileUtils.copyFile(scr, trg);
				
		
	}
}
