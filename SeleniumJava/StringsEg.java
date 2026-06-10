package USTGlobal.SeleniumJava;

public class StringsEg {

	public static void main(String[] args) {
		// String is a sequence in java and can be used to store the sequence of characters
		//string is immutable in java, means once a string is created, it cannot be changed.
		
		String s1 ="hello world";
		System.out.println(s1);
		String s2 = new String("hello world");
		System.out.println(s2);
		char[] ch={'h','e','l','l','o'};
		String s3 = new String(ch);
		System.out.println(s3);
		
		String s4 ="hello world";
		String s5 ="NEWDELHI";
		
		System.out.println(s4.length());
		System.out.println(s4.toLowerCase());
		System.out.println(s5.toUpperCase());
		
		//to compare 2 strings, we can use the equals method
		
		System.out.println(s4.equals(s5)); //false
		
		//equalsIgnoreCase is used to compare 2 strings ignoring the case
		
		System.out.println(s4.equalsIgnoreCase(s5)); //true
		
		//concatenation of strings
		
		System.out.println(s4.concat(s5)); //hello worldNEWDELHI
		
		//substring method is used to get the substring of a string
		
		System.out.println(s4.substring(0,5)); //hello
		
		System.out.println(s4.substring(1,3)); //el
		
		//replace
		
		System.out.println(s4.replace('e', 'a')); //hella warld
		
		//is empty
		
		System.out.println(s4.isEmpty()); //false
		
		//contains
		
		System.out.println(s4.contains("world")); //true
		
		//Split is used to split the string in to an array of strings based on the given delimitter
		
		String text ="java is a programming language";
		String[] result = text.split(" ");
		
		for(String str : result) {
			System.out.println(str+",");
		}
		}
		
	}


