package week1.day2;

public class LearnMethodAndObject {

	//methodName -> ctrl+ space
	public void startApp() {
		System.out.println("testleaf");
	}
	
	private String launchBrowser() {
		return "Chrome";
	}
	//default
	void locateElement(int data,String name) {
		System.out.println("total number :"+data+" element name"+name);	
	}
	protected void click(boolean actionPerformed) {
		System.out.println(actionPerformed);
	}
	
	  public int value() { 
		  return 12;
	  
	  }
	public static void main(String[] args) {
		//ClassName objectName=new Classname();
		LearnMethodAndObject mo=new LearnMethodAndObject();
		//objectName.methoName();
		mo.click(true);
		//dataType -directly i cannot print value
		//i need stored local variable then i can able to print
		String launchBrowser = mo.launchBrowser();
		System.out.println(launchBrowser);
		
		mo.locateElement(3, "user");
		mo.startApp();
		
		
		int value = mo.value();
		System.out.println(value);
	}
	
	
}
