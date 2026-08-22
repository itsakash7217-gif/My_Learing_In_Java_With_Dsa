package oopsClass.polymorphism;

class shape {
      void area(){
        System.out.println("This is the area of this shape.");
    }

//    final void area(){
//        System.out.println("This is the area of this shape.");
//    }
//

//    static void area(){
//        System.out.println("This is the area of this shape.");
//    }
//
//@overload in same class same method name but with different return type , parameter and order by......
//    this is the type of compile_time polymorphis
     void area(int a,int b){
        System.out.println("This is the area of this shape." + a*b);
    }

    int pera(int a,int b){
          return a+b;
    }


}

// Polymorphism is the greek language poly means(many) morphism means (form, shape)
// same method is execute in the multiple way
//@Override this the runtime polymorphism it chek during runtime and also check which one method call
//with dynamic method dispatch
// with @Override annotation you can check this method in child class is overriding or not
// with final you can not excess the parent class method
// with static not allow to excess into child because override need object but static does not depend on the object
// that is by static method does not override......... with static class it automatic implicit the all method in class
//static