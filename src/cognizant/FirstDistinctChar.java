package cognizant;
import java.util.*;
public class FirstDistinctChar {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        sc.nextLine();
        HashMap<Character,Integer> hm  = new HashMap<>();
        for(char a : s.toCharArray()){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        boolean flag =true;
        for(Character a : hm.keySet()){
            if(hm.get(a)==1) {
                System.out.print(a);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.print(-1);
        }
    }
}
