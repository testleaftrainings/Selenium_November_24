package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String data1 = driver.findElement(By.xpath("//div[contains(@class,'-scrollable-body')]/table/tbody/tr/td")).getText();
		
		System.out.println(data1);
		
		//print 2row and 3 col
		String rc = driver.findElement(By.xpath("//div[contains(@class,'-scrollable-body')]/table/tbody/tr[2]/td[3]")).getText();
		System.out.println("2nd row and 3rd col :"+rc);
		
		
		//count total rows
		List<WebElement> row = driver.findElements(By.xpath("//div[contains(@class,'-scrollable-body')]/table/tbody/tr"));
		int rowCount = row.size();
System.out.println("row size :"+rowCount);

//count col 

List<WebElement> col = driver.findElements(By.xpath("//div[contains(@class,'-scrollable-body')]/table/tbody/tr[1]/td"));
int colCount = col.size();
System.out.println("Col size :"+colCount);

//print all the value from table

for (int i = 1; i <= rowCount; i++) {
	
	for (int j = 1; j <=colCount; j++) {
		
		String text = driver.findElement(By.xpath("//div[contains(@class,'-scrollable-body')]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(text);
		
	}
	
}








driver.close();
	}

}
