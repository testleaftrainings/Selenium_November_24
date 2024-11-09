package week1.day1;

public class LearnIfElse {

	public static void main(String[] args) {

		int num=0;
		
		//if->ctrl+space
		//if(3>0)
		//if condition its true it will execute block code which given inside
		if (num>0) {
			System.out.println("Positive Number :"+num);
		}
		//if condition getting fail ,check with another condition -> else if
		else if(num==0) {
			System.out.println("Number is neutral :"+num);
		}
		//else -> if condition is not true it come to else
		else {
			System.out.println("Negative Number :"+num);
		}
		
		
		
		//if -> positive
		//if-else -> both +ve ,-ve
		//if-else if-else -> 2 or 3 conditions
	}

}
