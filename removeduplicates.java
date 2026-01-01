class removeduplicates {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        int j=2;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j ;
    }
    public static void main(String[] args) {
        removeduplicates rd = new removeduplicates();
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.print(rd.removeDuplicates(arr));
    }
}
