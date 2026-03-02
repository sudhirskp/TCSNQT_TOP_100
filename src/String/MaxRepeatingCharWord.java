package String;

public class MaxRepeatingCharWord {

    public void HighestRepeatedLetters(String str) {
        int len = str.length();

        // Initialize variables for tracking the maximum number of repeated letters
        int maximumword = 0;
        int curr_maximumword = 0;
        String result = "";

        // Iterate through each word in the string
        for (int left = 0; left < len;) {

            // Find the right end of the current word
            int right = left + 1;
            while (right < len && str.charAt(right) != ' ') {
                right++;
            }

            int[] frequency = new int[26];  // Frequency array for counting letter occurrences
            curr_maximumword = 0;

            // Count the frequency of each letter in the word
            for (int index = left; index < right; index++) {
                frequency[str.charAt(index) - 'a']++;
            }

            // Count the number of repeated letters in the word
            for (int index = 0; index < 26; index++) {
                if (frequency[index] > 1) {
                    curr_maximumword++;
                }
            }

            // Update the result if the current word has more repeated letters
            if (curr_maximumword > maximumword) {
                maximumword = curr_maximumword;
                result = str.substring(left, right);
            }

            // Move to the next word
            left = right + 1;
        }

        // If no word with repeated letters is found, print "-1"
        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println("Word with highest number of repeated letters: " + result);
        }
    }

    // Optimized approach to find the word with the highest number of repeated letters
    public void HighestRepeatedLettersOptimized(String str) {
        int len = str.length();

        // Initialize variables for tracking the maximum number of repeated letters
        int maximumword = 0;
        String result = "";

        // Iterate through each word in the string
        int left = 0;
        while (left < len) {

            // Find the right end of the current word
            int right = left;
            while (right < len && str.charAt(right) != ' ') {
                right++;
            }

            // Count the frequency of each letter in the word
            int[] frequency = new int[26];
            for (int index = left; index < right; index++) {
                frequency[str.charAt(index) - 'a']++;
            }

            // Count the number of repeated letters in the word
            int curr_maximumword = 0;
            for (int count : frequency) {
                if (count > 1) {
                    curr_maximumword += count - 1;
                }
            }

            // Update the result if the current word has more repeated letters
            if (curr_maximumword > maximumword) {
                maximumword = curr_maximumword;
                result = str.substring(left, right);
            }

            // Move to the next word
            left = right + 1;
            while (left < len && str.charAt(left) == ' ') {
                left++;
            }
        }

        // If no word with repeated letters is found, print "-1"
        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println("Word with highest number of repeated letters: " + result);
        }
    }

    public static void main(String[] args) {
        MaxRepeatingCharWord ob = new MaxRepeatingCharWord();
        ob.HighestRepeatedLetters("abcdefghij google microsoft");
        ob.HighestRepeatedLettersOptimized("abcdefghij google microsoft");
    }
}
