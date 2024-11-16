package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		//step 1 launch the empty browser
		ChromeDriver driver=new ChromeDriver();
		
		//step 2 load the url
		driver.get("https://www.testleaf.com");
		
		//step 3 maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//step 4 close the browser
		driver.close();
		
	}

}
