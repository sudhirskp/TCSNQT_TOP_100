package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Frequency_of_Char {

    String fr(String str){
        char ch [] = str.toCharArray();
        //Arrays.sort(ch); //no need it because frequency maintain the char ascending order
        //System.out.println(Arrays.toString(ch));
        int [] count = new int [26];
        for(char c : ch){
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<26;i++){
            if(count[i]!=0)
                sb.append((char)(i+'a')).append(count[i]).append(" ");
        }
        return sb.toString();
    }

    public static void printFrequency(String str) {
        char[] chars = str.toCharArray();

        // Sort the character array
        Arrays.sort(chars);

        char ch = chars[0]; // First character
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ch)
                count++;
            else {
                System.out.print(ch + "" + count + " ");
                ch = chars[i];
                count = 1;
            }
        }

        // Print the count of last character
        System.out.print(ch + "" + count + " ");
    }

    public static void main(String[] args) {
        Frequency_of_Char ob = new Frequency_of_Char();
        System.out.println(ob.fr("frequency"));
        System.out.println(ob.fr("takeuforward"));

    }
}
