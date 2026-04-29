class q1 {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        int zero=0;
        int one=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                one++;
            }
            while(zero>k && one>k){
                if(s.charAt(j)=='0'){
                    zero--;
                }
                else{
                    one--;
                }
                j++;
            }
            count+=(i-j+1);
        }
        return count;
    }
}