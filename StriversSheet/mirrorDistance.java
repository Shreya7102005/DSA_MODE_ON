public class mirrorDistance {
    public int mirrorDistance(int n) {
        int rev=0;
        int a=n;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        
    }
}
