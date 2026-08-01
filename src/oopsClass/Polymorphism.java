package oopsClass;
public class Polymorphism {
//    // runtime polymorphism --- overriding same mathhord in different class extended
//
//    class animal{
//        void sound(){
//            System.out.print("Animal is sound");
//        }
//    }
//    class dog extends animal{
//        @Override
//        void sound(){
//            System.out.println("Dog is Barking");
//        }
//    }

    //--------
    //this is the compile time polymorphism class contain same method multiple time with different parameters or return type
    class calculater{
        // overloading
        void add(int a , int b){
            int c =a+b;
            System.out.print("Sum of two int is :" + c);
        }
    void add(int a , int b,int c){
        int d =a+b+c;
        System.out.print("Sum of Three int is :" + d);
    }
    void add(double a , double b){
        double c =a+b;
        System.out.print("Sum of two double is :" + c);
    }
}
     void main() {
        calculater a =  new calculater();
        a.add(2,4);
         System.out.println();
        a.add(3,5,7);
         System.out.println();
        a.add(4.2,6.5);
//        animal Seru = new dog();
//        Seru.sound();
    }
}
