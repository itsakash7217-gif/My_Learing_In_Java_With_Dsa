package recursion;

import java.util.Scanner;

public class deletion {
    static String newString(String abc ,char x,int n){
        String ans="";
        if(n==abc.length()) return "";

        String small = newString(abc,x,n+1);
        if(abc.charAt(n)!=x) {
            return abc.charAt(n)+ small;
        }else {
            return small;
        }
    }
    static String remove(String s,char x){
        if(s.length()==0) return "";
        String small = remove(s.substring(1),x);
        if(s.charAt(0)!=x) {
            return s.charAt(0)+ small;
        }else {
            return small;
        }
    }
    static String reverse(String s , int x){
        if(x==s.length()) return "";
        String small = reverse(s,x+1);
        return small + s.charAt(x);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        sc.nextLine();
        String abc = sc.nextLine();
        System.out.println("usingh indeex");
        System.out.println(newString(abc,x,0));
        System.out.println("not using index");
        System.out.println(remove(abc,x));
        System.out.println("This is the reverse from of the string");
        System.out.println(reverse(abc,0));
    }
}
