package Learning;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello java");
        System.out.println("up");
        System.out.println(3 + 4);
        {
            int x;
            x=5;
            System.out.println(x);
            x=7;
            System.out.println(x);
            x=x+6;
            System.out.println(x);
            x=x-90;
            System.out.println(x);
        }
        //Arithmetic opereation
        int x = 5;
        int y = 3;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        {
            //Additional variables

            int z = 78;
            System.out.println("The value of x is : "+x); // +x means it convert variable x into text than it will print
            System.out.println("The value of y is : "+y);
            System.out.println("The value of z is : "+z);
        }
        //increment decrement
        //x++;// Learning.first print x than increment x pos
        //++x; // Learning.first increment than print x pre
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
// !@#$%^&*(){}[]/|\~.,<>:"':;+-= never use
    }
}
