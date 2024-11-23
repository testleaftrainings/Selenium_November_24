package week3.day1;

public class ChromeDriverC extends ChromiumDriverP {

	public void click(int b) {
		System.out.println("ChromeDriverC" +b);
	}
	
	public static void main(String[] args) {
		
		ChromeDriverC cd=new ChromeDriverC();
		//c=1,p=1,gp=2
		
		cd.findElement();
		cd.findElements();
		cd.startApp();
		cd.click(2);
	}
}
