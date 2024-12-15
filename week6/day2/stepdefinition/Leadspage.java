package stepdefinition;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leadspage extends ProjectSpecificMethod {

	@When("Click on crmsfa link")
	public void click_on_crmsfa_link() {
	   driver.findElement(By.linkText("CRM/SFA")).click(); 
	}

	@When("Click on Leads Button")
	public void click_on_leads_button() {
	    driver.findElement(By.linkText("Leads")).click();
	}

	@Then("Verify the leads clicked")
	public void verify_the_leads_clicked() {
	    String ld = driver.getTitle();
	    if(ld.contains("My Leads")) {
	    	System.out.println("Leads Button is clicked");
	    }else {
	    	System.out.println("Leads Button is not clicked");
	    }
	    
	}

}
