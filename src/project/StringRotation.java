package project;

public class StringRotation {
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isRotation(s1,s2));
	}
	
	public static boolean isRotation(String S1, String S2) {
			int len = S1.length();
			if(len == S2.length() && len>0) {
				String s1s1 = S1+S1;
				return s1s1.contains(S2);
			}
			return false;
	}
}
