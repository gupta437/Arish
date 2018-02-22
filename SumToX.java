package project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumToX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,6};
		pair(input,5);

	}
	
//	Complexity - O(N^2)
//	public static void pair(int[] input, int sum) {
//		
//		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
//		for(int i=0; i<input.length;i++) {
//			ArrayList<Integer> temp = new ArrayList<Integer>();
//			for(int j=i+1; j<input.length;j++) {
//				if(sum - input[i] == input[j]) {
//					System.out.println("i + "+input[i]+" j "+input[j]);
//					if(input[i]<input[j]) {
//						temp.add(input[i]);
//						temp.add(input[j]);
//					}else {
//						temp.add(input[j]);
//						temp.add(input[i]);
//					}
//					output.add(temp);
//				}
//			}
//		}
//		System.out.println(output);
//	}
	
	//Complexity - O(N)
	 public static void pair(int[] input, int sum) {
		 ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		 Set<Integer> hs = new HashSet<Integer>();
		 for(int i=input.length-1;i>=0;i--) {
			 if(hs.contains(sum-input[i])) {
				 ArrayList<Integer> temp = new ArrayList<Integer>();
				 if(input[i]<sum-input[i]) {
					 temp.add(input[i]);
					 temp.add(sum-input[i]);
					 output.add(temp);
				 }else {
					 temp.add(sum-input[i]);
					 temp.add(input[i]);
					 output.add(temp);
				 }
			 }else {
				 hs.add(input[i]);
			 }
		 }
		 ArrayList<ArrayList<Integer>> Result = new ArrayList<ArrayList<Integer>>();
		 for(int i=output.size()-1;i>=0;i--) {
			 Result.add(output.get(i));
		 }
		 System.out.println(Result);
	 }
}
