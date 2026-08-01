package tcs;

import java.util.Scanner;

public class NoOfVehicle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        int fw= (w/2)-v;
        int tw=v-fw;
        if(w%2!=0 || w<2*v || w>4*v) System.out.println("INVALID INPUT");
        else System.out.printf("No of Twoweeler %d and fourweeler %d  ",tw,fw);
    }
}

