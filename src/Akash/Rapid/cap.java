package Akash.Rapid;

class vt {
    int a;
    int b;

//    vt(int x, int y) {
//        System.out.println("Constructor of the object is called");
//        a = x;
//        b = y;
//    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }
}

public class cap {
    public static void main(String[] args) {
        vt obj = new vt();
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
        System.out.println("Multiplication: " + obj.mul());

    }
}