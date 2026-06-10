package USTGlobal.SeleniumJava;

public class MultiLevelC extends MultiLevelB{
	
	String Employeelocation = "Banglore";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiLevelC mc = new MultiLevelC();
		
		//data from parent class
		
		mc.employeedetails();
		
		//data from child class
		
		System.out.println(EmployeeBU);
		
		//data from 3rd child class
		
		System.out.println(mc.Employeelocation);
		
	}

}
