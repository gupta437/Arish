package project;

public class stringCompression {
	public static void main(String args[]) {
		System.out.println(compress("aabcccccaaa"));
	}
	public static String compress(String input) {
		StringBuilder output = new StringBuilder();
		char temp = input.charAt(0);
		int count =1;
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)!= temp || i==input.length()-1) {
				output.append(temp);
				output.append(count);
				temp = input.charAt(i);
				count=1;
			}else {
				count++;
			}
		}
		return output.toString();
	}
}
