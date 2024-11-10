package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {

		int num=20;
		//for loop
		//if condition
		//print the value 
		
		for (int i = 0; i <=num; i++) {
			
			//if(i%2==0) => % =reminder value
			//if(2%2==0) 
			if(i%2!=1){
				//if(2%2!=1)=(0!=1) true
				//if(3%2!=1)=(1!=1) false
				System.out.println("Even number :"+i);
			}
			
		}
	}

}
