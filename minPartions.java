class minPartions{
    public int minPartitions(String n) {
        int maxDigit=0;
        for(int i=0;i<n.length();i++){
            int dig=n.charAt(i)-'0';
            maxDigit=Math.max(maxDigit,dig);
        }
        return maxDigit;
    }
}