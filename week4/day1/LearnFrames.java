package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// https://www.leafground.com/frame.xhtml
		//NoSuchElementException -
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//handle the frame
		//index value '0'
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();
		
		//switch back to main page from any frame
		driver.switchTo().defaultContent();
		
		//nested frame 
		//1st frame 
		driver.switchTo().frame(2);
		
		//2nd frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().parentFrame();
		// immediate parent frame -driver.switchTo().frame(2);
		
		
	}

}
