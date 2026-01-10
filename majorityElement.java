public class majorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count = count + 1;
            }
            else{
                count = count - 1;
            }

        }
        return candidate;
    }
    public static void main(String[] args) {
        majorityElement me = new majorityElement();
        int[] arr = {2,2,1,1,1,2,2};
        System.out.print(me.majorityElement(arr));
    }
}
