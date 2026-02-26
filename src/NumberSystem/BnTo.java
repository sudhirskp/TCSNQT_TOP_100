package NumberSystem;

public class BnTo {
    int bnToDeci(int bn){
        String str = Integer.toString(bn);
        int base = 1;
        int ans = 0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)=='1'){
                ans+=base;
            }
            base*=2;
        }
        return ans;
    }

    int BnToDeci(int deci){
        String str = Integer.toString(deci);
        return Integer.parseInt(str, 2);
    }

    int BnToOctal(int bn){
        String str = Integer.toString(bn);
        // Pad with leading zeros to make length multiple of 3
        while(str.length() % 3 != 0){
            str = "0" + str;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i+=3){
            int num = Integer.parseInt(str.substring(i, i+3), 2);
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        BnTo obj = new BnTo();
        System.out.println(obj.BnToDeci(1011));
        System.out.println(obj.BnToOctal(11111));
    }
}
