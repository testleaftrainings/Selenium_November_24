package week3.day2;

public class StringMethods {

	public static void main(String[] args) {

		String value="Learn String Methods";
		
		//o/p -> LearnStringMethods
		String[] split = value.split(" ");
		//LearnStringMethods
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println();
		//replace
		String data="Selenium";
		String replace = data.replace('i', '$');
		System.out.println(replace);
		
		
		//replace All
		String name="TestLeaf2024@gamil.com";
		String replaceAll = name.replaceAll("[^0-9]", "&");
		System.out.println(replaceAll);
		
		//substring
		String d="Amazon have launched new Product";
		String substring = d.substring(5);
		System.out.println(substring);
		
		String substring2 = d.substring(2, 6);
		//endindex -1 => 6-1 =5(2,5)
		System.out.println(substring2);
		
		//toLowerCase
		String val="jaVA";
		String lowerCase = val.toLowerCase();
		System.out.println(lowerCase);
		
		//toUpperCase
		String upperCase = lowerCase.toUpperCase();
		System.out.println(upperCase);
		
		String price="34500";
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		
	}

}
