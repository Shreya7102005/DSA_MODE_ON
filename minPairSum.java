import java.util.Arrays;

public class minPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxCount=0;
        int left=0;
        int right=nums.length-1;
        while(left>right){
            int max=nums[left]+nums[right];
            maxCount=Math.max(max,maxCount);
            left++;
            right--;
        }
        return maxCount;
    }
}
