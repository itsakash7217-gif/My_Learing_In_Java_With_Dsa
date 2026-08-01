package ArrayList;
import java.util.*;
public class Reverse {
    static void change(ArrayList<Integer> a){
        int x =0 ; int y =a.size()-1;
        while(x<y){
            Integer temp = Integer.valueOf(a.get(x));
            a.set(x , a.get(y));
            a.set(y, temp);
            x++;
            y--;
        }
    }
    static void main() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println("Arraylist Original Print:");
        System.out.println(a);
        change(a);
        System.out.println(a);
        Collections.sort(a);
        System.out.println("Arrange in ascending order : " +a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println("Now order is Descending order : " +a);
    }
}
