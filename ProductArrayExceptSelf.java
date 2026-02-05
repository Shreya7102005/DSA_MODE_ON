public class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int mul=1;

            for(int j=0;j<nums.length;j++){
                mul*=nums[j];
            }

            if(nums[i]==0)
                answer[i]=mul;
            else
                answer[i]=mul/nums[i];
        }

        return answer;
    }

    public static void main(String[] args){
        ProductArrayExceptSelf s = new ProductArrayExceptSelf();

        int nums[] = {1,2,3,4};
        int res[] = s.productExceptSelf(nums);

        for(int x: res)
            System.out.print(x+" ");
    }
}
