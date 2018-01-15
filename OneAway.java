package project;

public class OneAway {
	public static void main(String args[]) {
		System.out.println(ifAway("pale","bale"));
	}
	public static boolean ifAway(String input1 , String input2) {
		
		if(input1.length() == input2.length()) {
			int change = 0;
			for(int i =0;i< input2.length(); i++) {
				if(input1.charAt(i) != input2.charAt(i)) {
					change++;
				}
			}
			if(change==1) {
				return true;
			}
		}
		if(input1.length()-1 == input2.length()) {
			int change = 0;
			for(int i =0;i< input1.length(); i++) {
				if(input2.indexOf(input1.charAt(i))<0) {
					change++;
				}
			}
			if(change==1) {
				return true;
			}
		}
		return false;
	}
}
