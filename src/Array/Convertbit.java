package Array;
import java.util.*;
public class Convertbit {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Eneter the bits: ");
        String a=sc.nextLine();
        String b="";
        int count=0;
        int x=0;
        for(int i = 0 ; i < a.length();i++){
        if (a.charAt(i) == '0'){
            b +='1';
            x++;
        }else {
            b += '0';
            x++;
        }
        }
        System.out.println("Original bits: " +a);
        System.out.println("Alter the bits: "+b);
        System.out.println("Number of times this code run: "+x);
    }
}
