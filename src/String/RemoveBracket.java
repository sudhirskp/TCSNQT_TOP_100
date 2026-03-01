package String;

public class RemoveBracket {

    public String removeBrackets(String expr) {
        // StringBuilder for result
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (char ch : expr.toCharArray()) {
            // Append if not a bracket
            if (ch != '(' && ch != ')') {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveBracket ob = new RemoveBracket();
        System.out.println(ob.removeBrackets("a+(b*c)-(d/e)")); //Output: a+b*c-d/e
    }
}