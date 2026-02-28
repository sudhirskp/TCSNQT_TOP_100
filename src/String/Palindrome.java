package String;

public class Palindrome {

    //1st
    boolean isPalindrome(String str){
        int l = 0;
        int r = str.length()-1;
        while(l<r){
            if(str.charAt(l++)!=str.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    //2nd
    public boolean palindrome(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;

        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // If both characters are the same, increment i and check start+1 and end-1.
        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Palindrome ob = new Palindrome();
        System.out.println(ob.isPalindrome("nitin"));
        System.out.println(ob.palindrome(0,"nitin"));
    }
}
