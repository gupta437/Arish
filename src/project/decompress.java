package project;

public class decompress {
	public static void main(String[] args) {
		
//		StringBuffer sb = new StringBuffer("2[3[a]4[b]c]");
//		outerloop:
//		for(int i =0; i<sb.length();i++ ) {
//			if(sb.charAt(i) == ']') {
//				innerloop:
//				for(int z =i;z>-1;z--) {
//					if(sb.charAt(z) == '[') {
//						int j=z+1;
//						StringBuffer temp = new StringBuffer();
//						while(sb.charAt(j) != ']') {
//							temp.append(sb.charAt(j));
//							j++;
//						}
//						String temp1 = temp.toString();
//						int n = Character.getNumericValue(sb.charAt(z-1));
//						for(int b = 0; b<n-1;b++) {
//							temp.append(temp1);
//						}
//						sb.replace(z+1, i, temp.toString());
//						sb.replace(z+temp.length()+1, z+temp.length()+2, "");
//						sb.replace(z-1, z+1, "");
//						break innerloop;
//					}
//				}
//			}else if(sb.charAt(i) != ']' && i == sb.length()-1) {
//				break outerloop;
//			}
//		}
//		System.out.println(sb.toString());
		String a = "3[a]4[c]bb";
		String[] d=a.split("(\\[)|(\\])");
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		for(int i=1;i<d.length;i=i+2) {
			int h=d[i-1].charAt(0)-'0';
			System.out.println(h);
			for(int j=0;j<h;j++) {
				System.out.print(d[i]);
			}
		}
		if(d.length%2 !=0) {
			System.out.println(d[d.length-1]);
		}
	}
}
