package USTGlobal.SeleniumJava;

public class SumNaturalnumbers_22052027 {

	public int sumn() {
        int sum = 0;
		for(int i=1; i<=10; i++)
		{
			sum = sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumNaturalnumbers_22052027 s = new SumNaturalnumbers_22052027();
		int finalsum = s.sumn();
		System.out.println("The sum of first 10 natural numbers is "+finalsum);
				
	}

}
