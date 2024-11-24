package week3.day2;

//class to abstract clas -> extends
public class ExecutionClass extends SbiCHennai {

	public static void main(String[] args) {

		ExecutionClass ec=new ExecutionClass();
		ec.atmLimit();
		ec.cardLimit();
		ec.kyc();
		ec.loan();
		Rbi.card();
		ec.carloan();
	}
	@Override
	public void kyc() {
		System.out.println("Pan Card");	
	}
	@Override
	void cardLimit() {
		
		System.out.println("10,000rs");
	}

	// Ex class exetnds Abs class implements interface
}
