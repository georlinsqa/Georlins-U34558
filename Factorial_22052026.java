package USTGlobal.SeleniumJava;

public class Factorial_22052026 {

	public long Factorial(int num) {

		long fact = 1;
				for (int i=1; i<=num; i++)
				{
					fact = fact *i;
				}
				
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		Factorial_22052026 f = new Factorial_22052026();
		long fa = f.Factorial(num);
		System.out.println("The factorial of number "+num+" is "+fa);
		}
	}
