package cognizant;

import java.util.*;

public class StringCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.next();
        }
        Set<String> st = new HashSet<>();
        for(String s : arr) {
            char[] c = s.toLowerCase().toCharArray();
            Arrays.sort(c);
            st.add(new String(c));
      }
        System.out.print(st.size());
    }
}
