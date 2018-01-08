package project;

import java.util.Arrays;

public class twoMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,2,3};
		findMissingNumbers(arr,arr.length+1);
	}
	public static void findMissingNumbers(int[] arr, int n) {
		Arrays.sort(arr);
		int sum = (n*(n+1))/2;
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1+=arr[i];
		}
		int x=(sum-sum1)/2, mid=x;
		for(int i=0;i<=mid;i++) {
			x^=i^arr[i];
		}
		int  y= arr.length+1;
		for(int i=mid+1;i<arr.length;i++) {
			y^=i^arr[i];
		}
		System.out.println("Two missing numbers are "+ x+" and "+y);
	}
}
