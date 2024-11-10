package week1.day2;

public class LearnObject {

	public static void main(String[] args) {

		//create object for that class
		LearnMethodAndObject m=new LearnMethodAndObject();
		m.startApp();
		m.click(true);
		m.locateElement(2, " Find");
		int v = m.value();
		System.out.println(v);
		
	}

}
