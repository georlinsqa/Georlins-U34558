package USTGlobal.SeleniumJava;

public class SingleChild extends SingleParent{
	//Child class date
	
	static String EmployeeBU = "HR";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild sc = new SingleChild();
		
		//data from your parent clas
		
		sc.employeedetails();
		
		//data from child class
		
		System.out.println(EmployeeBU);

	}

}


