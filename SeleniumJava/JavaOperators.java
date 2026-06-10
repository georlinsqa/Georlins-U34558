package USTGlobal.SeleniumJava;

public class JavaOperators {

	public static void main(String[] args) {
		// Unary Operator
		
		//Increment Operator ++
		
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		
		// Decrement operator
		
		int b = 20;
		System.out.println(b--);
		System.out.println(b);
		
		int c= 10;
		System.out.println(++c);
		
		int d=20;
		System.out.println(--d);
		
		//arithametic operators
		
		int e = 10;
		int f = 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//shift operators - right shift and left shift
		
		// right shift - divide the number by 2
		
		int g= 10;
		System.out.println (g >> 2); //10/2^2 =10/4 = 2
		
		int h = 100;
		System.out.println (h >> 3); //100/2^3 = 100/8 = 12
		
		//left shift - multiple the number by 2
		
		int i = 10;
		System.out.println(i << 2); //10*2^2 = 10*4 = 40
		
		//Relational Operators
		
		int j = 10;
		int k = 20;
		System.out.println (j>k); //false
		System.out.println (j<k); //true
		System.out.println (j>=k); //false
		System.out.println (j<=k); //true
		System.out.println (j==k); //false
		System.out.println (j!=k); //true
				
		
		
		
		
		

	}

}
