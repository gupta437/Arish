package project;

public class powerSet {
	public static void main(String[] args) {
		char[] input = {'a','b','c'};
		int n =1<<input.length;
		for(int i=0;i<n;i++) {
			System.out.print("{ ");
			for(int j = 0; j < input.length; j++) {
				System.out.print("("+i+","+(1<<j)+")");
				if ((i & (1 << j)) > 0) {
					System.out.print((i &(1<<j))>0);
                    System.out.print(" "+input[j] + " ");
                 }
			}
			System.out.println("}");
		}
	}
}
