class reverseString{
    public String reversePrefix(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        String str1 = new StringBuilder(s.substring(0, k)).reverse().toString();
        String str2 = s.substring(k, n);
        return str1+str2;
    }
}