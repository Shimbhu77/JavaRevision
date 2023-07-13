import java.util.Arrays;

public class AverageSum {

public static void main(String[] args) {
		
		int[] nums = {1,2,5,3,6,8,23,10};
		
		int n = nums.length;
		int sum =0;
		
		 for(int i=0;i<n;i++)
		 {
			  sum = sum+nums[i];
		 }
		 
		 double avg = (double)sum/n;
		 
//		 System.out.println(avg+" n: "+n);
		 System.out.println(avg);
		
	}
}
