package week3.day2;

public interface Rbi {

	//100% abstract method till java 1.7
	public void kyc();
	
	public void atmLimit();
		
	
	//after java 1.7 
	//default and static
	
	  static void card() {
	  System.out.println("Java 1.8");
	  }
	  
	  default void loan() {
	  System.out.println("java 1.8");
	  }
	  
	  default void  carloan() {
		  System.out.println("car loan");
	  }
	 

}
