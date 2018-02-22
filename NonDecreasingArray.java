package project;

public class NonDecreasingArray {
	public static void main(String[] args) {
		int[] input = {4,2,1};
		System.out.print(checkPossibility(input));
	}
	public static boolean checkPossibility(int[] nums) {
        int modified = 0;
        for (int i = 1, prev = nums[0]; i < nums.length; i++) {
            if (nums[i] < prev && modified++ > 0) return false;
            if (nums[i] < prev && i - 2 >= 0 && nums[i - 2] > nums[i]) continue;
            prev = nums[i];
        }
        return true;
    }
}
