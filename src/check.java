package project;

public class check {

	public static void main(String[] args) {
		String a = "abcabcabcabcac";
		String b = "abc";
		int times = 0;
		for (int i = 0; i <= a.length() - b.length(); i++) {
		    String substring = a.substring(i, i + b.length());
		    if (substring.equals(b)) {
		        times = times + 1;
		    }
		}
		System.out.println(times);

	}

}
