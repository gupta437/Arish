package project;

import java.awt.List;
import java.util.HashSet;
import java.util.*;
public class duplicateEncoding {

	private static final String Set = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,2,1,3,4,3};
		findDuplicate(arr);
	}
	public static void findDuplicate(int[] arr){
			Set<Integer> result = new HashSet<Integer>();
			//int[] arr1 = arr;
			for(int d=0;d<arr.length;d++) {
				//System.out.println(" "+arr[d]);
				int i = Math.abs(arr[d])-1;
				if(arr[i]<0) {
					result.add(arr[d]);
				}else
				//System.out.println(" "+arr[i]);
				arr[i] = -arr[i];
				//System.out.println(" "+arr[i]);
			}
			
			System.out.println(result);
	}
}
