package Accenture;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EachFirstLastSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();

        // Split by one or more spaces
        String[] words = s.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (w.length() > 0) {
                String temp = "" + w.charAt(0) + w.charAt(w.length() - 1);
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        String ans = "";
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                ans = e.getKey();
            }
        }

        System.out.println(ans + " " + max);
    }
}
