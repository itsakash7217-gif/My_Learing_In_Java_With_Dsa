package String;
import java.util.*;
public class tcsfindSmallString {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Test cases: ");
        int n = sc.nextInt();
        System.out.println();
        String[] arr = new String[n*2];
        int x = 0 ;
        for(int i=0;i<n;i++) {
            System.out.print("P : ");
            String p = sc.next();
            sc.nextLine();
            System.out.print("S : ");
            String s = sc.next();
            String[] arr1 = {p,s};
            for(int  j=0;j<arr1.length;j++){
                arr[x++]=arr1[j];
            }
        }
        for(int i=0;i<arr.length;i=i+2) {
            find(arr[i], arr[i+1], "");
            System.out.println();
        }
    }
    static void find(String p , String s ,String ans){
        Set<Character> hm = new HashSet<>();
        for(int i = 0 ; i < s.length();i++){
            hm.add(s.charAt(i));
        }
        for(int i = 0 ; i < p.length();i++){
            if(hm.contains(p.charAt(i))){
                ans+=p.charAt(i);
            }
        }
        System.out.print(ans);
    }
}

/*
: polikujmnhytgbvfredcxswqaz
S :abcd
P : qwryupcsfoghikldezvxbintma
S :ativedoc*/