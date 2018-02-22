package project;

public class factorial {
	public static void main(String[] args) {
		System.out.println(factorial1(9));
	}
	public static int factorial1(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*factorial1(n-1); 
		}
	}
}
