package week3.day1;

public class ChromiumDriverP extends RemoteWebDriverGP {

	public void startApp() {
		System.out.println("ChromiumDriver p");
	}
	
	public static void main(String[] args) {
		ChromiumDriverP cd=new ChromiumDriverP();
		cd.findElement();
		cd.findElements();
		cd.startApp();
	}
	
}
