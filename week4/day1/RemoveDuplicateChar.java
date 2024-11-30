package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String name="Selenium";
		//selnium
		char[] ch = name.toCharArray();
		Set<Character>duplicate=new LinkedHashSet<Character>();
		
		//add the value in the set
		for (Character unq : ch) {
			duplicate.add(unq);
			
		}
		System.out.println(duplicate);
		
		//set value 
		for (Character character : duplicate) {
			System.out.print(character);
		}
		
	}

}
