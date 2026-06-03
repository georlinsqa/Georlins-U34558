package USTGlobal.SeleniumJava;

public class DataTypes_21052026 {
	//int
	public int add() {
		int a= 10;
		int b= 20;
		int c = a+b;
		return c;
	}
	
	//double
	public double calarea() {
		int r= 10;
		double area= 3.14 *r * r;
		return area;
	}
	
	public boolean bval() {
	
	boolean b = true;
	return b;
	}
	
	public String sval() {
		
	String a = "Hello";
	String b = "World";
	return (a+b);
	}

public static void main(String[] args) {
	
	DataTypes_21052026 d = new DataTypes_21052026();
	int result = d.add();
	System.out.println("Addition is "+result);
	double area = d.calarea();
	System.out.println("Area is "+area);
	System.out.println("Boolean value is "+d.bval());
	System.out.println("String value is "+d.sval());

}

}
