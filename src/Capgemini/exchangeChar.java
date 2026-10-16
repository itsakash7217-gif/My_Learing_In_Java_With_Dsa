package Capgemini;

import java.util.*;
public class exchangeChar {
    static char temp;
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char a : s.toCharArray()){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        String ans ="";
        int max = 0;
        for(char a : mp.keySet()){
            if(mp.get(a)>max){
                max=mp.get(a);
                temp=a;
            }
        }
        for(char a : s.toCharArray()){
            if(a==temp) ans+=c;
            else ans+=a;
        }
        System.out.print(ans);
    }
}
