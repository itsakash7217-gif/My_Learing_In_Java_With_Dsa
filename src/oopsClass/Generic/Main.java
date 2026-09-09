package oopsClass.Generic;

public class Main {
    static void main() {
        CompareInGeneric a = new CompareInGeneric(12,34);
        CompareInGeneric b = new CompareInGeneric(32,44);
        if(b.compareTo(a)>0){
            System.out.println("Marks of b is greater than a");
        }
        System.out.print(a.toString());
    }
}
