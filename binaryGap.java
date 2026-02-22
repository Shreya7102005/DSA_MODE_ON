public class binaryGap {
    public int binaryGap(int n){
        String bin = Integer.toBinaryString(n);
        int maxDist = 0;

        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1'){
                for(int j = i + 1; j < bin.length(); j++){
                    if(bin.charAt(j) == '1'){
                        maxDist = Math.max(maxDist, j - i);
                        break; 
                    }
                }
            }
        }
        return maxDist;
    }
}
