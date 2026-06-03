package USTGlobal.SeleniumJava;

public class PositiveNegativecheck_22052029 {

	public void check(int num) {
        if(num >0)
        {
        	System.out.println(num+" is a Positive number");
        }
        else if (num <0)
        {
        	System.out.println(num+" is a Negative number");
        }
        else
        {
        	System.out.println("The number is zero");
        }
        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -16781571;
		PositiveNegativecheck_22052029 c = new PositiveNegativecheck_22052029();
c.check(num);
				
	}

}
