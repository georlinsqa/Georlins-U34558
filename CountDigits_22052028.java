package USTGlobal.SeleniumJava;

public class CountDigits_22052028 {

	public int count(int num) {
        int digit = 0;
        int temp = num;
		if(temp ==0)
		{
			digit = 1;
		}
		else {
			while (temp > 0)
			{
				temp = temp/10;
				digit++;
				
			}
		}
		return digit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16781571;
		CountDigits_22052028 c = new CountDigits_22052028();
		int counts = c.count(num);
		System.out.println("The number of digits in the number "+num+" is "+counts);
				
	}

}
