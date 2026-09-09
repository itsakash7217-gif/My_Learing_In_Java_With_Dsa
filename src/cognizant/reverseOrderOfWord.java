package cognizant;
import java.util.Scanner;
public class reverseOrderOfWord {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] w = word.trim().split(" ");
        String ans  = "";
        for(int i = w.length-1 ; i>=0 ; i--){
            ans=ans+w[i]+" ";
        }
        System.out.println(ans);
    }
}
