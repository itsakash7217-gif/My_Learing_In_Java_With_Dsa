package oopsClass.polymorphism;

public class main {
    static void main() {
//        shape a = new square();
//        circle b = new circle();
//        square c = new square();
//        a.area();
//        b.area();
//        c.area();

        shape c = new circle();
        shape b = new square();
        c.area();
        System.out.println(c.pera(1,3));
        b.area();
    }
}
