package project;

public class sumWithoutPlus {
	public static void main (String args[]) {
		System.out.println(sum(7,3));
	}
	public static int sum(int a, int b) {
		if(b==0) return a;
		int partialSum = a^b;
		int carryOver = (a&b) <<1;
		return sum(partialSum,carryOver);
	}
}
