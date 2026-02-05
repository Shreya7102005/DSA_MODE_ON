public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int n=s.length();
       String words[]=s.split(" ");
       int a=words.length;
       int len=words[a-1].length();
       return len;
    }
    public static void main(String[] args) {
        LengthOfLastWord ls = new LengthOfLastWord();

        String s = "Hello World";

        int result = ls.lengthOfLastWord(s);

        System.out.println(result);
    
    }
}
