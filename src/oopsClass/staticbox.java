package oopsClass;

class test{
    String name;
    static int a=2;
    static int b;
    static{
        System.out.println("Hello World");
        test.b=a*2;
    }
}
public class staticbox {
    static void main() {
        test num =new test();
        System.out.print(test.b);
        System.out.print(test.b);

        System.out.print(test.b);

    }
}
