package Accenture;
import java.util.*;
public class StringWithFreqInasc {
    static void main() {
        class pair implements Comparable<pair>{
            char a;
            int b;
            pair(char a, int b){
                this.a = a;
                this.b = b;
            }
            public int compareTo(pair t){
                return this.a-t.a;
            }
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        PriorityQueue<pair> a =  new PriorityQueue<>();
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>e:m.entrySet()){
            a.add(new pair(e.getKey(),e.getValue()));
        }
        StringBuilder ans = new StringBuilder();
        while(!a.isEmpty()){
            pair p = a.poll();
            ans.append(p.a);
            ans.append(p.b);
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
