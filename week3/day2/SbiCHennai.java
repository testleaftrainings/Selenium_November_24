package week3.day2;

public abstract class SbiCHennai implements Rbi{

	@Override
	public void atmLimit() {
		System.out.println("1000rs");
		
	}
	abstract void cardLimit();
	//both implement and unimplement method
	//0 to 100% abstract method
	
	public static void main(String[] args) {
		//for interface we can able create object - no
	//	Rbi r=new Rbi();
		
		//for abstract we can able create object - no
		//sSbiCHennai s=new SbiCHennai();
		
	}
}
