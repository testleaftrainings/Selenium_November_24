package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//getWindowHandle
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent ID :"+parentWindow);
		String titleParent = driver.getTitle();
		System.out.println(titleParent);
		
		//getWindowHandles
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		//convert set into list
		List<String> getWindow=new ArrayList<String>(allWindow);
		driver.switchTo().window(getWindow.get(1));
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.findElement(By.id("email")).sendKeys("dilipkumar.rajendran@testleaf.com");
		Thread.sleep(3000);
		//close the current window or tab
		driver.close();
		//switch to parent window again
		driver.switchTo().window(getWindow.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//it will close all opened window
		driver.quit();
		
	}

}
