package activity2;
import java.util.Arrays;

public class simulation1 {

	public static void run() {
		int[] nums = {2,3,1,7,9,5,11,3,5};
		
		System.out.println(Arrays.toString(nums));
		System.out.println(diff_between_two_elements(nums));
    }
    public static int diff_between_two_elements(int[] nums){
        int diff_two_elemnts = Integer.MIN_VALUE;
        
        for (int i = 0 ; i < nums.length-1; i++){
            for(int j = i+1; j<nums.length;j++){
                diff_two_elemnts = Integer.max(diff_two_elemnts, nums[j] - nums[i]);
            }
        }
        return diff_two_elemnts;
	}
}
