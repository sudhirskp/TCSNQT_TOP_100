package Cloud_Analogy_Campus_Drive;

public class ReverseStringWithLen {
    //we need to wap that reverse the string word by word and count the consonants and add the count at the end of the string
    //ex : Input : str = "Software Developer"
    //Output : "Developer5 Software5"

    String reverseStringWithLen(String str){
        StringBuilder sb = new StringBuilder();
        String [] st = str.split(" ");
        String vowels = "aeiouAEIOU";

        for(int i = st.length-1; i >=0 ; i--){
            char [] ch = st[i].toCharArray();
            int count = 0;
            for(char c : ch){
                if(!vowels.contains(String.valueOf(c))){
                    count++;
                }
            }
            sb.append(st[i]).append(count).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseStringWithLen obj = new ReverseStringWithLen();
        System.out.println(obj.reverseStringWithLen("Software Developer"));
    }
}
