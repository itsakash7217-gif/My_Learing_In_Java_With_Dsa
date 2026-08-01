package recursion;

public class mobileTxt {
    static void string(String[] res, String num ,String ans){
        if(num.length()==0){
            System.out.print(ans+" ");
            return;
        }
        int numdigit = num.charAt(0)-'0';
        String a = res[numdigit];
        for(int i = 0 ; i < a.length() ; i++){
            string(res,num.substring(1),ans+a.charAt(i));
        }
    }
    static void main() {
        String num = "23";
        String[] keypad = {
                "",
                "",
                "ABC",
                "DEF",
                "GHI",
                "JKL",
                "MNO",
                "PQRS",
                "TUV",
                "WXYZ"
        };
        string(keypad,num,"");
    }
}
