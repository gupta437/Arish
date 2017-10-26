package project;
import java.util.Hashtable;

public class sumabc {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			table.put(a[i], 1);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(table.containsKey(a[i]+a[j])) {
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
	}
}
