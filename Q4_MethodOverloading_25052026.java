package Assessment_25052026;

public class Q4_MethodOverloading_25052026 {
	
	//method overloading - compile time polymorphism
	
	//with 2 integers
	
	public int add(int a, int b)
	{
		return (a+b);
	}
	
	//with 3 integers
	
	public int add(int a, int b, int c)
	{
		return (a+b+c);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q4_MethodOverloading_25052026 p = new Q4_MethodOverloading_25052026();
		
		int sum = p.add(10, 20);
		int sum1 = p.add(10, 20, 30);
		System.out.println("Sum of 2 integers is "+sum);
		System.out.println("Sum of 3 integers is "+sum1);
	}

}
