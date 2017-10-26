package project;

import java.util.HashMap;
import java.util.Map;

public class twosumProblem {
	public static void main(String[] args) {
		int[] output = new int[2];
		int[] input = {2,7,11,15};
		output = twoSum(input,9);
		System.out.print(output[0]+" "+output[1]);
		
	}
//    public static int[] twoSum(int[] nums, int target) {
//    	int[] output = new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=0; i<nums.length; j++){
//                if(nums[i]+nums[j] == target && j!=i){
//                    output[0] = i;
//                    output[1] = j;
//                    return output;
//                }
//            }
//        }
//		return output;
//    }
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length; i++) {
			map.put(nums[i], i);
		}
		int[] output = new int[2];
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])&& (map.get(target-nums[i]) != i)) {
				output[0] = i;
				output[1] = map.get(target-nums[i]);
				return output;
			}
		}
		return output;
	}
}