package week1.day2;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {

		int[] num= {23,54,67,12,45,90,23,12};
		//NESTED for loop -two for loop
		//if condition
		//print duplicate value
		
		//i=23
		//i=54
		//i=67
		for (int i = 0; i < num.length; i++) { //outer for loop 
			//j=54,67,12,45,90,23,12
			//j=67,12,45,90,23,12
			//j=12,45,90,23,12
			for (int j = i+1; j < num.length; j++) { //inner for loop
				
				if(num[i]==num[j]) {
					System.out.println("Duplicate value :"+num[i]);
				}
			}
		}
		
		System.out.println("************************************");
		
		//sort 
		//12,12,23,23,45,54,67,90
		//if(num[7]==num[7+1])
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			//if(num[0]==num[0+1])=>if(12==12)
			if(num[i]==num[i+1]) {
				System.out.println("Duplicate value : "+num[i+1]);
			}
			//2,6,7,9 => 0-3
			//index 4
			
		}
		
		
		
		
	}

}
