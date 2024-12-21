package week7.day1;

public class Browser {
 
	int data;
	boolean value;

	public Browser() {
		System.out.println("I am default constructor");
	}
	
	public Browser(int data,boolean value) {
		this();
		this.data=data;
		this.value=value;
		System.out.println(data+" "+value);
		
	}
	
	public static void main(String[] args) {
		
		//Browser b=new Browser();
//		System.out.println("Default value for int :"+b.data);
//		System.out.println("Default value for boolean :"+b.value);
//	
	      Browser b1=new Browser(5,true);
	
	}
}
