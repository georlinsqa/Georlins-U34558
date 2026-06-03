package USTGlobal.SeleniumJava;

public class Palindrome_22052026 {

	public int pali(int num) {

		int original = num;
		int reverse = 0;
		
		while(num !=0)
			{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num /10;
			}
			
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		Palindrome_22052026 p = new Palindrome_22052026();
		int pa = p.pali(num);
		if(num==pa)
		{
		System.out.println("The number "+num+" is a Palindrome number-Reverse : "+pa);
		}
		else 
		{
			System.out.println("The number "+num+" is not a Palindrome number-Reverse : "+pa);
		}
		}
}