package project;

public class goooo {

	public static void main(String[] args) {
		String a = "(){}";
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='(') {
				b++;
				}else if (a.charAt(i)==')') {
					c++;
				}
			
			if(a.charAt(i)=='{') {
				d++;
			}else if (a.charAt(i)=='}'){
				e++;
			}
		}
	if(b==c && d==e) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	
	}

}