package Capgemini;

import java.util.Scanner;

public class initialSpeed {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        String[] arr = s.split(" ");
        int v = Integer.parseInt(arr[0]);
        int a = Integer.parseInt(arr[1]);
        int t = Integer.parseInt(arr[2]);
        int u = v-(a*t);
        System.out.println(u);
        sc.close();
    }
}
