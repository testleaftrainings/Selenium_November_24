package week3.day2;

//what keyword to use b/w class and interface
//extends - class to class
//implements - class to interface
//extends - interface to interface
public class SbiBank implements Rbi{

	@Override
	public void kyc() {
		System.out.println("Kyc : Pan card");
		
	}

	@Override
	public void atmLimit() {
System.out.println("500rs");		
	}

	public static void main(String[] args) {
		SbiBank sb=new SbiBank();
		sb.kyc();
		sb.atmLimit();
		sb.loan();
		//static method - classname or interface .method()
		Rbi.card();
	}
}
