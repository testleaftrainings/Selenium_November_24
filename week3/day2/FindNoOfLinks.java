package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfLinks {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/link.xhtml");
		
		//findElement returnType - WebElement
		//findElements returnType - List<WebElement>
		//driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		int size = totalLink.size();
		System.out.println("Total Number of link is :"+size);
		
		for (int i = 0; i <totalLink.size(); i++) {
 
			System.out.println(totalLink.get(i).getText());
		}
		
		
	}

}
