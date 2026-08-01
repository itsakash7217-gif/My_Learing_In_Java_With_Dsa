package recursion;
import java.util.*;
public class Subset {
    static ArrayList<String> subset(String s){
        ArrayList<String> arr = new ArrayList<>();
        if(s.length()==0){
            arr.add("");
            return arr;
        }
        char curr = s.charAt(0);
        ArrayList<String> small = subset(s.substring(1));
        for(String ss : small){
            arr.add(ss);
            arr.add(curr+ss);
        }
        return arr;
    }
    static void printss(String s , String c){
        if(s.length()==0){
            System.out.print('"'+c+'"'+" ");
            return;
        }
        char a = s.charAt(0);
        String small = s.substring(1);
        printss(small,c+a);
        printss(small,c);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ArrayList<String> ans = subset(a);
        System.out.printf("This is the SubSet of the String %s : ",a);
        System.out.println(ans);
        System.out.println("this method use to reduce the Space complexity to O(1) :");
        printss(a,"");
    }

}
