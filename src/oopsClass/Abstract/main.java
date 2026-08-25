package oopsClass.Abstract;

public class main {
    public static void main(String[] args) {
        child c =  new child();
        c.abs();
        c.pay();
        child2 c2 =  new child2();
        c2.abs();
        c2.pay();
    }
}


// abstract the parent class only provide the method and child class do overriding
// this make  possible to make multi inheritance