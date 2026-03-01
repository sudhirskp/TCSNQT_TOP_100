package String;

public class Capitalize {

    public String capitalizeFirstLast(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;

        // Traverse the string word by word
        while (start < n) {
            // Skip spaces
            while (start < n && arr[start] == ' ')
                start++;

            if (start >= n)
                break;

            int end = start;

            // Find the end of the current word
            while (end < n && arr[end] != ' ')
                end++;

            // Capitalize first character if lowercase
            if (Character.isLowerCase(arr[start]))
                arr[start] = Character.toUpperCase(arr[start]);

            // Capitalize last character if lowercase and word length > 1
            if (end - 1 > start && Character.isLowerCase(arr[end - 1]))
                arr[end - 1] = Character.toUpperCase(arr[end - 1]);

            // Move to next word
            start = end;
        }

        // Return modified string
        return new String(arr);
    }

    public static void main(String[] args) {
        Capitalize ob = new Capitalize();
        System.out.println(ob.capitalizeFirstLast("I am a boy")); // I AM A Boy
    }
}