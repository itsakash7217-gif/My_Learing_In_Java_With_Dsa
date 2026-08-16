package cognizant;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag=false;
        if(num<0){
            flag=true;
            System.out.print("Invalid");
        }
        int check=0;
        int dummy =num;
        if(!flag){
            while(dummy>0){
                check=check*10+dummy%10;
                dummy/=10;
            }
            if(check==num) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
    }
}
