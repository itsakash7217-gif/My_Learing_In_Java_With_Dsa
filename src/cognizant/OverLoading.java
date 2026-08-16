package cognizant;

import java.util.Scanner;

public class OverLoading {

    public static void d() {
        System.out.println("Enter the name :::::::::");
    }
    public static void d(String name) {
        System.out.println(name);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        OverLoading n = new OverLoading();
        n.d();
        n.d("Akash");

    }
}
