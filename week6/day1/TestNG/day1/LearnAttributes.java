package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = 3)
	public void createLead() {
		System.out.println("CreateLead");
	}
	

	@Test(priority = -1)
	public void editLead() {
		System.out.println("EditLead");
	}
	

	@Test(priority = 2)
	public void account() {
		System.out.println("Account");
	}
	
	

	@Test(priority =-5,enabled = false)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
	

}
