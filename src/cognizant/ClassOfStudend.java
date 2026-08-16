package cognizant;
import java.util.Scanner;


public class ClassOfStudend {
    int rollno;
    String name;
    int marks[];
    ClassOfStudend(int rollno, String name, int[] marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public double total(){
        double sum = 0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum/=5;
    }
    public static String grd(double avg){
        if(avg>90) return "A";
        else if(avg>80) return "B";
        else if(avg>70) return "C";
        else if(avg>60) return "D";
        else return "F";
    }
    public void display(){
        double avg = total();

        System.out.println(rollno+" "+name+" "+grd(avg)+" "+avg);
    }
    static void main() {
    Scanner sc = new Scanner(System.in);
    int Rollno = sc.nextInt();
    String Name = sc.next();
    sc.nextLine();
    int[] marks = new int[5];
    for(int i = 0 ; i < 5 ; i++){
        marks[i] = sc.nextInt();
    }

    ClassOfStudend st = new ClassOfStudend(Rollno,Name,marks);
    st.display();

    }
}
