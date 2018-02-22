package project;

import java.util.Hashtable;
import java.util.Set;

public class jgj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int b[][] = {{0,1,1},{0,1,1},{0,1,1}};
//		for(int i=0;i<3;i++) {	
//				System.out.println(b[i][0]+" "+b[i][1]+" "+b[i][2]+" ");
//		}
		
		
//		int[] input = {1,2,3,4};
//		int[] output = {1,1,1,1};
//		for(int i=0;i<input.length;i++) {
//			for(int j=0;j<input.length;j++) {
//				if(j!=i) {
//					output[i] = output[i]*input[j];
//				}
//			}
//		}
//		for(int i=0;i<input.length;i++) {
//			System.out.print(output[i]+" ");
//		}
		
		
		
//		int[] input = {1,2,3,4};
//		int[] product1 = new int[input.length];
//		int o=1;
//		for(int i=0;i<input.length;i++) {
//			System.out.print((product1[i] = o)+" ");
//			o*=input[i];
//		}
//		System.out.println();
//		int[] product2 = new int[input.length];
//		o=1;
//		for(int i=(input.length-1);i>=0;i--) {
//			product2[i] = o;
//			o*=input[i];
//		}
//		for(int i=0;i<input.length;i++) {
//			System.out.print(product2[i]+" ");
//		}
//		System.out.println();
//		int[] output = new int[input.length];
//		for(int i=0;i<input.length;i++) {
//			System.out.print((output[i] = product1[i]*product2[i])+" ");
//		}
		
		
//		int[] output = new int[input.length];
//		o=1;
//		for(int i=input.length-1;i>=0;i--) {
//			output[i] = product1[i]*o;
//			o*=input[i];
//		}
//		for(int i=0;i<input.length;i++) {
//			System.out.print(output[i]+" ");
//		}
		
		String str1 = "A statement is a statement";
		String str2 = "statement a";
		String[] a = str1.split(" ");
		String[] b = str2.split(" ");
		Hashtable<String,Integer> table = new Hashtable<String,Integer>();
		for(int i=0;i<a.length;i++) {
			if(!table.containsKey(a[i])) {
				table.put(a[i], 1);
			}else {
				table.put(a[i], table.get(a[i])+1);
			}
		}
		for(int i=0;i<b.length;i++) {
			if(table.containsKey(b[i])){
				table.put(b[i], table.get(b[i])-1);
			}
		}
		Set<String> st = table.keySet();
		for(String n:st) {
			for(int i=1;i<=table.get(n);i++) {
				System.out.print(n+" ");
			}
		}
		int z = 1;
		System.out.println();
		System.out.println(z<<1);
		
	}
}
