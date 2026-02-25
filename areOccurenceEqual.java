import java.util.HashMap;

public class areOccurenceEqual {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int freq=-1;
        for(int val:map.values()){
            if(freq==-1){
                freq=val;
            }
            else if(freq!=val){
                return false;
            }
        }
        return true;
    }
}
