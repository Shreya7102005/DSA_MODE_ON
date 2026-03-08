import java.util.HashMap;

public class sumofunique {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}
