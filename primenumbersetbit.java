public class primenumbersetbit {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int c=0;
            String str = Integer.toBinaryString(i);
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch=='1'){
                    c=c+1;
                }
            }
            if (isPrime(c)) {
                count++;
            }
        }

        return count;
    }

    
    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
