package HashMap;
import java.util.*;
public class Basic {
    static void main() {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Akash",22);
        mp.put("Moti",21);
        mp.put("Khusi",19);
        mp.put("Ashu",16);
        mp.put("Shiva",25);
        mp.put("Adarsh",15);
        System.out.println(mp.get("Moti"));
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsValue(22));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        System.out.println(mp);
        for(String key : mp.keySet()){
            System.out.printf("Age of %s the %d \n" , key , mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> a : mp.entrySet()){
            System.out.printf("Age of %s the %d \n" , a.getKey() , a.getValue());
        }
    }
}
