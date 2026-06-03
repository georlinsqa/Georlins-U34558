package USTGlobal.SeleniumJava;

public class Square_21052026 {

	public int findsquare(int num) {
		int square= num * num;
		return square;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=6;
		Square_21052026 s = new Square_21052026();
		int sq = s.findsquare(no);
		System.out.println("square of "+no+" is "+sq);
	}

}
