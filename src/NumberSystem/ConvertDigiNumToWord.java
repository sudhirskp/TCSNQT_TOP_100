package NumberSystem;

import java.util.ArrayList;
import java.util.List;

public class ConvertDigiNumToWord {


    public static void main(String[] args) {
        ConvertDigiNumToWord ob = new ConvertDigiNumToWord();
        int input = 7824;
        String result = convertDigiNumToWord(input);
        System.out.println(result);
        ob.convertNumIntoWord("123");
    }

    public static String convertDigiNumToWord(int n) {
        List<String> words = new ArrayList<>();

        if (n == 0) {
            return "Zero";
        }

        if (n >= 1000000000) {
            words.add(convertDigiNumToWord(n / 1000000000) + " Billion");
            n %= 1000000000;
        }

        if (n >= 1000000) {
            words.add(convertDigiNumToWord(n / 1000000) + " Million");
            n %= 1000000;
        }

        if (n >= 1000) {
            words.add(convertDigiNumToWord(n / 1000) + " Thousand");
            n %= 1000;
        }

        if (n >= 100) {
            words.add(convertDigiNumToWord(n / 100) + " Hundred");
            n %= 100;
        }

        if (n >= 20) {
            int tensDigit = n / 10;
            words.add(getTensWord(tensDigit) + " " + getOnesWord(n % 10));
        } else if (n != 0) {
            words.add(getOnesWord(n));
        }

        return String.join(" ", words);
    }

    private static String getTensWord(int tensDigit) {
        String[] tens = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        return tens[tensDigit - 1];
    }

    private static String getOnesWord(int onesDigit) {
        String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        return ones[onesDigit];
    }

    public void convertNumIntoWord(String str) {
        // Words for single digits
        String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // Words for numbers from 10 to 19
        String[] twoDigits = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        // Words for multiples of ten from 20 onwards
        String[] tensMultiple = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        // Words for higher powers
        String[] tensPower = {"hundred", "thousand"};

        // Handle empty input
        if (str.length() == 0) {
            System.out.println("");
            return;
        }

        // Handle single digit input
        else if (str.length() == 1) {
            System.out.println(singleDigit[str.charAt(0) - '0']);
            return;
        }

        // Store length of string
        int len = str.length();

        // Loop through each digit
        for (int i = 0; i < str.length(); i++) {
            // If more than two digits remain
            if (len > 2) {
                // Print digit and its place value if digit is not zero
                if (str.charAt(i) - '0' != 0) {
                    System.out.print(singleDigit[str.charAt(i) - '0'] + " ");
                    System.out.print(tensPower[len - 3] + " ");
                }
                len--;
            } else {
                // Handle numbers between 10 and 19
                if (str.charAt(i) - '0' == 1) {
                    System.out.print(twoDigits[str.charAt(i + 1) - '0'] + " ");
                    return;
                }
                // Handle multiples of 10 and following digit
                else if (str.charAt(i) - '0' != 0) {
                    System.out.print(tensMultiple[str.charAt(i) - '0'] + " ");
                    if (str.charAt(i + 1) - '0' != 0)
                        System.out.print(singleDigit[str.charAt(i + 1) - '0'] + " ");
                    return;

                }
            }
        }
    }
}