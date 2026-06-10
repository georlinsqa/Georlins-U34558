package USTGlobal.SeleniumJava;

public class Variables {
	
	//Instance Variable
	
	String EmployeeBU = "HR";
	
	// Local variables - scope is within the method
	
	public void employeedetails() {
		
		//local variable
		
		String employeename = "Ravi";
		int empid = 1234;
		
		System.out.println("Employee Name is :"+employeename);
		System.out.println("Employee BU is :"+EmployeeBU);
		System.out.println("Employee id is :"+empid);
		
	}
	
	// Instance variables - scope is within the class and object
	
	// Static variables - scope is within the class and object
	//but can access without creating an object

	public static void main(String[] args) {

Variables v = new Variables();
v.employeedetails();

System.out.println(v.EmployeeBU);
	}

}
