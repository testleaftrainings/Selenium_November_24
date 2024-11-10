package week1.day2;

public class LearnJumpStmt {

	public static void main(String[] args) {

		//break -stop process
		//continue -skip that value 
		
		for (int i = 0; i < 6; i++) {
			
			//if(0==3)
			//if(1==3)
			//if(2==3)
			//if(3==3)
			if(i==3) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}

}
