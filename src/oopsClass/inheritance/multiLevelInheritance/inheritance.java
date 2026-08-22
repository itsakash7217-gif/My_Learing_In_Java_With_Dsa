package oopsClass.inheritance.multiLevelInheritance;

public class inheritance {
    static void main() {
//        human h = new human(8);
//        System.out.print(h.height);

//        sample a = new sample(159,90,8,"Krishkant Dudpuriya Singth","male");
//        System.out.println(a.name);
//        System.out.println(a.gender);
//        System.out.println(a.height);
//        System.out.println(a.weight);
//      System.out.println(a.age);
//
//person paglu = new person(176,90,"Lodhimahush Singh",70000,"Single","Netpoli");
//System.out.println(paglu.height);
//System.out.println(paglu.weight);
//System.out.println(paglu.name);
//System.out.println(paglu.salary);
//System.out.println(paglu.status);
//System.out.println(paglu.gender);
//System.out.println(paglu.location);
//System.out.print(paglu.weight);



        human h = new sample("Jasumannnani","female",12); // we can refer the class to the child this is happened because of the
//        // child class inherit hte properties of parent class that is by we can make raferance to parent to child
//        sample h = new sample("Jasumannnani","female"); can not refer child class to the parent one because of the
//        non access and having attributes that we are passing into the child class

        System.out.println(h);
        // main point we can only access those parameter that present inside the parent class
    }
}
