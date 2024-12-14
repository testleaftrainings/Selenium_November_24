package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	public ChromeDriver driver ;

	@Given("Launch the browser and Load the Url")
	public void launch_the_browser_and_load_the_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("Enter the username as DemoSalesManager")
	public void enter_the_username_as_demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	@When("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login is Successful")
	public void verify_login_is_successful() {
		String title = driver.getTitle();

		if(title.contains("Leaftaps")) {
			System.out.println("Login is successful");
		}else {
			System.out.println("Login is not successful");
		}
	}

}
