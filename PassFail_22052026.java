package USTGlobal.SeleniumJava;

public class PassFail_22052026 {

	public String StudentPass(int marks) {
        String result = "Fail";
		if (marks >= 40)
		{ 
		result = "Pass";
		}
		if(marks < 40) 
		{
		return "Fail";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=41;
		PassFail_22052026 p = new PassFail_22052026();
		String pf = p.StudentPass(mark);
		if(pf =="Pass" )
		{
			System.out.println("The student with marks "+mark+" has Passed");
		}
		else
		{
			System.out.println("The student with marks "+mark+" has Failed");
		}
		
	}

}
