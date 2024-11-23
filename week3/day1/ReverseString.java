package week3.day1;

public class ReverseString {

	public static void main(String[] args) {

		String value="Selenium";
		//muineleS
		//toCharArray
		//forloop
		
		char[] ch = value.toCharArray();//{'S','e',.....}
		
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.print(ch[i]);
		}
	}

}
