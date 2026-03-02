package String;

public class ChangeTo {
    String ChangeTo(String str){
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            char c = (ch == 'z') ? 'a' : (char)(ch + 1);
            sb.append(c);
        }
        return sb.toString();
    }

    public static char getNextChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return (c == 'z') ? 'a' : (char)(c + 1);
        } else if (c >= 'A' && c <= 'Z') {
            return (c == 'Z') ? 'A' : (char)(c + 1);
        } else {
            // For non-alphabetic characters, just return the next Unicode char
            return (char)(c + 1);
        }
    }


    public static void main(String[] args) {
        ChangeTo ob = new ChangeTo();
        System.out.println(ob.ChangeTo("abcdxyz"));
    }
}
