package USTGlobal.SeleniumJava;

public class DivisibilityCheck_22052026 {
	
	public int divisible(int num) {
		int flag = 0;
		if (num % 5 == 0 && num % 11 == 0)
		{ 
			flag = 1;
		}
		else
		{
			flag =0;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=55;
		DivisibilityCheck_22052026 d = new DivisibilityCheck_22052026();
		int dc = d.divisible(no);
		if(dc==1)
		{
			System.out.println("The number "+no+" is divisible by both 5 and 11");
		}
		if(dc==0)
		{
			System.out.println("The number "+no+" is not divisible by either 5 or 11 or both");
		}
	}

}
