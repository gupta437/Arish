package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DeleteAndEarnDP {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		
		
		System.exit(1);
		ProcessClass obj= new ProcessClass();
		int ele[]= {1,1,3,4};
		System.out.println(obj.processElements(ele));

	}
	
}

// class to Process
class ProcessClass{
	public int processElements(int[] elements) {
		
		if (elements.length ==0) return 0;
		if (elements.length==1) return elements[0];
		int[] temp = elements;
		Arrays.sort(temp);
		
		
		 int upper_limit = temp[temp.length-1]+1;
		 //System.out.println(upper_limit);
		 int[] new_arr = new int[upper_limit];
		 Arrays.fill(new_arr, 0);
		 for(int i: elements) {
			 new_arr[i]+=i;
		 }
		
		
		int[] dp_arr = new int[upper_limit];
		 Arrays.fill(dp_arr, 0);
		 dp_arr[1] = Math.max(new_arr[0],new_arr[1]);
		 dp_arr[0] = new_arr[0];
		 
		 for(int i=2;i<upper_limit;i++) {
			 dp_arr[i] = Math.max(new_arr[i] + dp_arr[i - 2], dp_arr[i - 1] );
		 }
		 return dp_arr[dp_arr.length-1];
	}
	
}
