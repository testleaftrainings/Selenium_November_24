package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		List<String> subject=new ArrayList<String>();
		
		//add
		subject.add("Maths");
		subject.add("Tamil");
		subject.add("English");
		subject.add("Hindi");
		subject.add("Social");
		subject.add("Tamil");
		subject.add("Hindi");
		
		System.out.println(subject);
		
		//size
		int size = subject.size();
		System.out.println("List Length :"+size);
		
		//index value start from '0'
		//2-English
		subject.add(2, "Gk");
		System.out.println(subject);
		
		//remove
		subject.remove(4);
		System.out.println(subject);
		
		//contains
		boolean contains = subject.contains("Tamil");
		System.out.println(contains);
		
		//get
		String string = subject.get(5);
		System.out.println(string);
		
		for (int i = 0; i < subject.size(); i++) {
			System.out.println(subject.get(i));
		}
		
		//clear
		subject.clear();
		System.out.println(subject);
		
		String string2 = subject.get(1);
		System.out.println(string2);
		
		
		
	}

}
