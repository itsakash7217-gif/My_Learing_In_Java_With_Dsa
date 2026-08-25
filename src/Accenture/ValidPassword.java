package Accenture;
import java.util.*;
public class ValidPassword {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int n = password.length();
        int l = 0;
        int u = 0;
        int c = 0;
        boolean flag = false;
        if(password.charAt(0)>='1' && password.charAt(0)<='9') {
            flag = true;
        }else if(password.contains(" ") && password.contains("/")) {
            flag = true;
        }else{
            for(int i=0;i<n;i++){
                char ch = password.charAt(i);
                if(ch>='a' && ch<='z'){
                    l++;
                }
                if(ch>='A' && ch<='Z'){
                    u++;
                }
                if(ch>='0' && ch<='9'){
                    c++;
                }
            }
        }
        if(!flag && l>=4 && u>=1 && c>=1){
            System.out.print("Valid: "+password);
        }else{
            System.out.print("Invalid: "+password);
        }
    }
}
