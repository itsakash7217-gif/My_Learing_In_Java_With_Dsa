package tcs;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1= new StringBuilder(str).reverse().toString();
        if(str1.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
