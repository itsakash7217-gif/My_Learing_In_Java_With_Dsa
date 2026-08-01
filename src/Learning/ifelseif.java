package Learning;

import java.util.Scanner;
public class ifelseif {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=18){
            System.out.println("young");
        }else if(age>18 && age<40){
            System.out.println("Men");
        }else{
            System.out.println("old");
        }
    }
}
