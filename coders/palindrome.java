public class palindrome {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int first=0;
        int last=str.length()-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
