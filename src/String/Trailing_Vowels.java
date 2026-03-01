package String;

public class Trailing_Vowels {


        public String trimTrailingVowels(String s) {
            String vowels = "aeiou";
            int n = s.length();

            // Walk backwards until a non-vowel is found
            int i = n - 1;
            while (i >= 0 && vowels.indexOf(s.charAt(i)) != -1) {
                i--;
            }

            // If all characters are vowels, return empty string
            if (i < 0) return "";

            // Otherwise return substring up to the last non-vowel
            return s.substring(0, i + 1);
        }

    public static void main(String[] args) {
        Trailing_Vowels ob = new Trailing_Vowels();
        System.out.println(ob.trimTrailingVowels("idea"));
    }
}
