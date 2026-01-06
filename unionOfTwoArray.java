//question: Write a Java program to find the union of two arrays and return it as a sorted array without duplicates.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class unionOfTwoArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums1){
            set.add(n);
        }
        for(int m:nums2){
            set.add(m);
        }
        ArrayList<Integer>arr1=new ArrayList<>(set);
        Collections.sort(arr1);
        int[] arr = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            arr[i] = arr1.get(i);
        }
        return arr;
        
    }
    public static void main(String[] args) {
        unionOfTwoArray ua = new unionOfTwoArray();
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 4, 5};
        int[] result = ua.unionArray(arr1, arr2);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
