package cognizant;
import java.util.*;
public class longestWord {
    public static boolean voble(String s){
        if(s.isEmpty()) return false;
        String word = s.toLowerCase();
        return word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' || word.charAt(0)=='o'|| word.charAt(0)=='u';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = s.trim().split("\\s+");
        int l =0;
        StringBuilder ans = new StringBuilder("00");
        for(int i=0;i<word.length;i++){

            if(word[i].length()>l && word[i].length()%2==0){
                if(voble(word[i])){
                    ans.delete(0,ans.length());
                    ans.append(word[i]);
                    l = word[i].length();
                }
            }
        }
        System.out.print(String.valueOf(ans));
    }
}
