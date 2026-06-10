package USTGlobal.SeleniumJava;

public class MathodOverridingChild extends MethodOverridingParent {
	
	 public void sound(String name)
	 {
		 System.out.println(name);
		 System.out.println("Dog barks");
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathodOverridingChild md = new MathodOverridingChild();
		md.sound("Jimmy");

	}

}
