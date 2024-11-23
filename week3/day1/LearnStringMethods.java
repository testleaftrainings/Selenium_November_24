package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {

		String name="TestLeaf";
		String comName=new String("TestLeaf");
		
		//index value will start from '0'
		//length
		int textlength = name.length();
		System.out.println("Length of the String :"+textlength);
		
		//chartAt()
		char charValue = name.charAt(4);
		System.out.println("CharAt () index of 4 :"+charValue);
		
		//equals -string content
		String d="TestLeaf";
		if(name.equals(comName)) {
			System.out.println("Value is Equal");
		}else {
			System.out.println("Value is not Equal");
		}
		//what is different b/w .equals() & ==
		//== -> it will check address of the value
		
		if(name==d) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		
		//equalsIgnoreCase
		String a="testleaf";
		if(d.equalsIgnoreCase(a)) {
			System.out.println("EqualIgnoreCase done");
		}else {
			System.out.println("EqualIgnoreCase not done");
		}
		
		//contains
		String j="Selenium";
		boolean contains = j.contains("ele");
		System.out.println(contains);
		
		
		//toCharArray
		String n="Dilip";
		
		char[] ch = n.toCharArray(); //{D,i,l,i,p}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		
		
		
	}

}
