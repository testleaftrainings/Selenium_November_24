package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends ProjectSpecificMethod {

	/*
	 * @DataProvider(name="getData") public String[][] setValue(){ //row - how many
	 * lead to create //col- how many value is present inside application String[][]
	 * data=new String[2][3]; data[0][0]="TestLeaf"; data[0][1]="Dilip";
	 * data[0][2]="Kumar";
	 * 
	 * 
	 * data[1][0]="Testleaf"; data[1][1]="Gokul"; data[1][2]="S"; return data;
	 * 
	 * }
	 */
	
	//step 5
	//indices -index value will start from '0'
	//it will check with row count
	@DataProvider(name="getData",indices = {1,2})
	public String[][] fetchData() throws IOException {
		
		//static method - no need create object call this method
		//call as -ClassName.methodName()
		return DataLibrary.readvalue();
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






