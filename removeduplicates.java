//replace duplicates in sorted array such that each element appear atmost twice
class removeduplicates {

    public int removeDuplicates(int[] nums) {
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        removeduplicates rd = new removeduplicates();
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.print(rd.removeDuplicates(arr));
    }
}
