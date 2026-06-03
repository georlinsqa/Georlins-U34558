package USTGlobal.SeleniumJava;

public class Prime_22052027 {

	public boolean prime(int num) {

		boolean isprime = true;
		if(num <=1)
		{ isprime = false;}
		else
		{
			for(int i=2; i<=Math.sqrt(num); i++)
			{
				if(num%i==0) {
					isprime = false;
					break;
					
				}
			}
		}
		return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		Prime_22052027 p = new Prime_22052027();
		boolean pa = p.prime(num);
		if(pa)
		{System.out.println("The number "+num+" is a prime number");}
		else
		{System.out.println("The number "+num+" is not a prime number");}	
		}
		
		}