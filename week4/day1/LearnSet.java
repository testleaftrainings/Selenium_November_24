package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		String[] mentors= {"Vinoth","Vineeth","Anbu","Vinoth","Mukesh","Kathri","Muthu","Anbu"};

		//Set<String> mentor=new HashSet<String>(); //random order
		//Set<String> mentor=new LinkedHashSet<String>(); //insertion  order
		
		//sort value -TreeSet
		Set<String> mentor=new TreeSet<String>(); //sort order


		//for each loop
		//for loop -> int,cond,in/dc
		//int i=0;i<nun;i++
		
		for (String var : mentors) {
			mentor.add(var);
		}

		System.out.println(mentor);


		for (String string : mentor) {
			System.out.println(string);
		}
		
		//convert Set into List
		
		List<String> name=new ArrayList<String>(mentor);
		String string = name.get(2);
		
		System.out.println(string);
		
	}

}
