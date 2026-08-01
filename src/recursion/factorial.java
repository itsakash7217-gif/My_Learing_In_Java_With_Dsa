package recursion;

import java.util.*;

public class factorial {
    public static void main(String[] args) { // ✅ Use standard main signature
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }

    static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // ✅ Base case
        }
        return n * Factorial(n - 1); // ✅ Recursive step
    }
}
