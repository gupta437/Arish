package project;

public class decompress {
	public static void main(String[] args) {
		String input = "3[abc]4[ab]c";
		String output = " ";
	
		for(int i =0; i<input.length();i++ ) {
			if(input.charAt(i) == '[') {
				for(int j=i+1;j<input.length();j++) {
					if(input.charAt(j) == ']') {
						
					}
				}
			}
		}
	}
}
