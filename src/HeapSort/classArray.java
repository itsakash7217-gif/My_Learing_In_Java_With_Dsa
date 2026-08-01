package HeapSort;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int age;
    double cgpa;
    Student(String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
    @Override
    public int compareTo(Student s){
        //return this.age - s.age;
//        return this.name.compareTo(s.name);
        return Double.compare(this.cgpa,s.cgpa);
    }
}


public class classArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s2 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s3 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s4 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student[] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
        for(Student a: arr){
            System.out.println(a.name+","+a.age+","+a.cgpa);
        }
    }
}
