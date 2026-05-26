package LabTests;

public class Studentinfo {
	
	static String school = "Naipunnya Public school";
	String place = "Kochi";
	
	public void studentdetails (String studentname) 
	{
		int clas = 10;
		int rollnum = 12;
		String classteacher = "Jane";
		
		System.out.println("The student "+studentname+" is studying in school "+school+" at "+place+" is having class teacher as "
				+classteacher+" In class "+clas+" with rollnumber "+rollnum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentinfo s = new Studentinfo();
s.studentdetails("john smith");
System.out.println("School is "+school);
System.out.println("Place is "+s.place);

	}

}
