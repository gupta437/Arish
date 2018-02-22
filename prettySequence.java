package project;

public class prettySequence {
	public static void main(String[] args) {
		int[] a= {7890, 4861, 65773, 3769, 4638, 46000, 548254, 36185, 115};
		System.out.println("result " +ps(a));
	}
	public static int ps(int[] a) {
		int p =1;
		for(int i=0; i<a.length;i++) {
			p *=a[i];
		}
		int j=0;
		int counter = 0;
		String product = Integer.toString(p);
		if(product.charAt(product.length()-1)=='5') {
			return 0;
		}else {
//			for(int i=0;i<a.length;i++) {
//				if(a[i] == 5) {
//					j=1;
//					break;
//				}
//			}if( j==1) {
//				for(int i=0;i<a.length;i++) {
//					String d = Integer.toString(a[i]);
//					int g = d.length();
//					if(d.charAt(g-1) == '2' || d.charAt(g-1) == '4' || d.charAt(g-1) == '6' || d.charAt(g-1) == '8' || d.charAt(g-1) == '0') {
//						String b = Integer.toString(a[i]);
//						b.replace(b.charAt(b.length()-1), '1');
//						a[i] = Integer.parseInt(b);
//						counter++;
//					}
//					p=1;
//					for(int z=0;z<a.length;z++) {
//						p*=a[z];
//					}
//					String product1 = Integer.toString(p);
//					if(product1.charAt(product1.length()-1)=='5') {
//						return counter;
//					}
//				}
//			}else {
//				for(int k=0;k<a.length;k++) {
//					String d = Integer.toString(a[k]);
//					int g = d.length();
//					if(d.charAt(g-1) == '2' || d.charAt(g-1) == '4' || d.charAt(g-1) == '6' || d.charAt(g-1) == '8' || d.charAt(g-1) == '0') {
//						String b = Integer.toString(a[k]);
//						char gh = b.charAt(b.length()-1);
//						 String fh =b.replace(gh,'5');
//						a[k] = Integer.parseInt(fh);
//						counter++;
//						break;
//					}
//				}
//				for(int i=0;i<a.length;i++) {
//					String d = Integer.toString(a[i]);
//					int g = d.length();
//					if(d.charAt(g-1) == '2' || d.charAt(g-1)== '4' || d.charAt(g-1) == '6' || d.charAt(g-1)== '8' || d.charAt(g-1)== '0') {
//						String c = Integer.toString(a[i]);
//						c.replace(c.charAt(c.length()-1), '1');
//						a[i] = Integer.parseInt(c);
//						counter++;
//					}
//					p=1;
//					for(int z=0;z<a.length;z++) {
//					}
//					String product1 = Integer.toString(p);
//					if(product1.charAt(product1.length()-1)=='5') {
//						return counter;
//					}
//				}
//			}
			boolean hasfive = false;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					counter++;
				}else if(a[i]%10 == 5) {
					hasfive = true;
				}
			}
			if(hasfive == false) {
				counter++;
			}
				return counter;
			}
		
	}
}
