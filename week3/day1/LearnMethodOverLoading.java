package week3.day1;

public class LearnMethodOverLoading {

	public void startApp(String browser) {
		System.out.println("Browser Name :"+browser);
	}
	
	public void startApp(String browser,boolean headless) {
		System.out.println("Browser Name :"+browser +"\n"+"Headless mode :"+headless);
	}
	
	public void locateElement(String value) {
		System.out.println(value);
	}
	
	public void locateElement(String locators,String value) {
		System.out.println(locators+" "+value);
	}
	
	public static void main(String[] args) {
		LearnMethodOverLoading mo=new LearnMethodOverLoading();
		mo.startApp("Chrome");
		mo.startApp("Edge", false);
		mo.locateElement("username");
		mo.locateElement("id","username");
		//example :
		//println -java
		//frame()-index,id or name,webElement - selenium
		
		
		
		
		
		
	}
}
