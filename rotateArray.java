import java.util.ArrayList;

public class rotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n; 
        int a=n-k;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=a;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<a;i++){
            arr.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr.get(i);
        }
    }
    public static void main(String[] args) {
        rotateArray ra = new rotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        ra.rotate(arr, k);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
