package week1.day2;

import java.util.Arrays;


public class LearnArrays {

	public static void main(String[] args) {

		int[] age= {30,23,12,45,89,25,43};
		//array will work on index value
		//index will start from '0'
		//its fixed in size
		
		
		//print the value
		System.out.println("print second value :"+age[1]);
		
		//find length of array
		//press ctrl+2 -> choose the 2nd option to create local variable
		int length = age.length;
		System.out.println("length of the array :"+length);
		
		//print last value inside array
		System.out.println("print last value :"+age[length-1]);
		
	//sort order
		Arrays.sort(age);
		//12,23,25,30,43,45,89
		System.out.println("after sort index 0:"+age[0]);
		
		//print all the values inside the array
		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		//ArrayIndexOutOfBoundsException - add length-1
		for (int i = age.length-1; i >=0 ; i--) {
			System.out.println(age[i]);
		}
		
		
		
	}

}
