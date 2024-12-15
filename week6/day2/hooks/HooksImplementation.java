package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class HooksImplementation extends ProjectSpecificMethod {
	
	
	@Before
	public void preCondition() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	@After
	public void postCondition() {
	driver.close();	
	}
	
}
