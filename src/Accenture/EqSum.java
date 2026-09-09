package Accenture;
import java.util.*;
public class EqSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
       int nn =n;
       while(check(nn)>n){
           ans.add(nn);
           nn-=1;
       }
       System.out.println(ans);
       sc.close();
    }
    public static int check(int n){
        String s = Integer.toString(n);
        int sum =0 ;
        for(int i = 1 ; i <=s.length() ; i++){
            sum+=Integer.parseInt(s.substring(0,i));
        }
        return sum;
    }
}
