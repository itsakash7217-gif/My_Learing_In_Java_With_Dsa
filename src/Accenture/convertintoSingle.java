package Accenture;
import java.util.*;
public class convertintoSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>=10){
            if(n%2==0){
                n=(int) Math.floor((n-2)/2);
            }else{
                n=(int) Math.floor(n/2);
            }
        }
        System.out.println(n);
    }
}

//even-floor((n-2)/2)
//odd- floor(n/2)