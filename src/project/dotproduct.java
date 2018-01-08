package project;

public class dotproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2};
		int b[] = {1,2};
		int c = dotProduct(a,b);
		System.out.println(c);
	}
	public static int dotProduct(int a[], int b[]) {
		int n = a.length;
		int n1 = b.length;
		int c = 0;
		if(n!=n1) {
			return 0;
		}else {
			for(int i=0;i<n;i++) {
				c += a[i]*b[i];
			}
			return c;
		}
	}

}
