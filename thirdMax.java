//third maximum number
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class thirdMax {
    public int thirdMax(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int n:nums){
            set.add(n);
       }
       ArrayList<Integer>arr=new ArrayList<>(set);
       Collections.sort(arr);
       int n=arr.size();
       if(n<3){
        return arr.get(n-1);
       }
       return arr.get(n-3);
       
    }
    public static void main(String[] args) {
        thirdMax tm = new thirdMax();
        int[] arr = {2,2,3,1};
        System.out.print(tm.thirdMax(arr));
    }
}
