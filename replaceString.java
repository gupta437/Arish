package project;

public class replaceString {
	public static void main(String[] args) {
		String input = "Mr John Smith    ";
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb);
		int count =0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==(' ')) {
				count++;
			}
		}
		int k=0;
		while(k<input.length()+(count*2)) {
			if(sb.charAt(k) == ' ') {
				sb.replace(k, k+1, "%20");
				k=k+3;
			}else {
				k++;
			}
		}
		System.out.println(sb);
//		int count =0;
//		for(int i=0;i<input.length();i++) {
//			if(input.charAt(i)==(' ')) {
//				count++;
//			}
//		}
//		char[] ch=input.toCharArray();
//		
//		int index = input.length()+count*2;
//		char[] ch1 = new char[index];
//		for(int i = input.length()-1;i>=0;i--) {
//			if(ch[i]==' ') {
//				ch1[index-1] = '0';
//				ch1[index-2] = '2';
//				ch1[index-3] = '%';
//				index = index-3;
//			}else {
//				ch1[index-1] = ch[i];	
//				index--;
//			}
//		}
//		String output =  String.valueOf(ch1);
//		System.out.println(output);
	}
		
}
