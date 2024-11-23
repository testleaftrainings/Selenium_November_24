package week3.day1;

public class LearnMethodOverriding extends ChromeDriverC {

	public void click(int a) {
		System.out.println("Method overriding"+ a);
		super.click(3);
	}
	
	public static void main(String[] args) {
		LearnMethodOverriding mo=new LearnMethodOverriding();
	mo.click(5);
	
	//to access parent class data
	//keyword - super 
	//super -its going call data from your parent class
	}
	
}
