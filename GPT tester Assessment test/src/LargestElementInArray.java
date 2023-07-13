import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,5,3,6,8,23,10};
		
		Arrays.sort(nums);
		
		int largestElement = nums[nums.length-1];
		
		System.out.println(largestElement);
	}
}
