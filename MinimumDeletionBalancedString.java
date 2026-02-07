class MinimumDeletionBalancedString{
    public int minimumDeletions(String s) {
        int del=0;
        char ch[]=s.toCharArray();
        int bcount=0;
        for(char c:ch){
            if(c=='b'){
                bcount++;
            }
            else{
                del=Math.min(del+1,bcount);
            }
        }
        return del;
    }
}