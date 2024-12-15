package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import hooks.HooksImplementation;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends ProjectSpecificMethod{

	@When("Enter the username as {string}")
	public void enter_the_username_as_demo_sales_manager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
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
	
	@But("Verify Login is not Successful")
	public void loginNotSuccessful() {
		String title = driver.getTitle();

		if(title.contains("Leaftaps")) {
			System.out.println("Login is not successful");
		}else {
			System.out.println("Login is successful");
		}
	}
	

}
