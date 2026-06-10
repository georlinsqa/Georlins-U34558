package USTGlobal.SeleniumJava;

public class StaticVariables {
	
	//Static Variable
	
	static String EmployeeBU = "HR";
	
	//Static variables scope is within the class and object

public static void employeedetails() {
		
		//local variable
		
		String employeename = "Ravi";
		int empid = 1234;
		
		System.out.println("Employee Name is :"+employeename);
		System.out.println("Employee BU is :"+EmployeeBU);
		System.out.println("Employee id is :"+empid);
		
	}
	
	public static void main(String[] args) {

employeedetails();

System.out.println(EmployeeBU);
	}


}
