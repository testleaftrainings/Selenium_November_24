package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CreateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setValue() {
		data="CreateLead24";
	}
	
	
	@Test(dataProvider = "getData")
	public  void runCreateLead(String comName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






