package USTGlobal.SeleniumJava;

public class WhiledoWhileloop {

	public static void main(String[] args) {
		int i=1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
//do while loop executes this block of code atleast once even if the condition is false
			int j=1;
			do {System.out.println(j);
			j++;
			} while(j<=10);
			
//jump statements are used to transfer the control to other parts of the program
			
			for (int k=1; k<=10; k++) {
				if(k==5) {
					continue; // will skip the current iteration and will move to the next iteration
			}
			System.out.println(k);
			if(k==3) {
				break; 
		}
		System.out.println(k);
			}
			
	}

}
