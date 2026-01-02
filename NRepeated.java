import java.util.HashSet;

public class NRepeated {
     public int repeatedNTimes(int[] nums) {
        /*Arrays.sort(nums);
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
        }
        return -1;*/

        //optimal approach

        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        NRepeated nr = new NRepeated();
        int[] arr = {1,2,3,3};
        System.out.print(nr.repeatedNTimes(arr));
    }
}
