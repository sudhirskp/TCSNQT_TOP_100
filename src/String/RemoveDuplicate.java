package String;

public class RemoveDuplicate {

    String Remove(String str){
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!sb.toString().contains(""+ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicate ob = new RemoveDuplicate();
        System.out.println(ob.Remove("cbacdcbc"));
    }
}
