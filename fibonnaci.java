package project;

public class fibonnaci {
	public static void main(String[] args) {
		System.out.println(fibbonaci1(0));
	}
	public static int fibbonaci1(int n) {
		if( n==0) {
			return 0;
		}else if ( n==1) {
			return 1;
		}else {
			return fibbonaci1(n-1)+fibbonaci1(n-2);
		}
	}
}
