package oopsClass.ArraysLists;
import java.util.Arrays;
import java.util.Scanner;
public class arraylist<T> {
    private Object[] arr;
    private static int Default = 10;
    private int size= 0;


    arraylist(){
        this.arr = new Object[Default];
    }
    void add(Object n){
        if(isfull()){
            newone();
        }
        arr[size++]=n;
    }
    void newone(){
        Object[] temp = new Object[arr.length*2];
        for(int i = 0 ; i < size ; i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    Object remove(){
        Object removed=arr[size-1];
        size--;
        return removed;
    }
    Object get(){

        return arr[size-1];
    }
    void set(int n,Object m){
        if(isfull()){
            newone();
        }
        arr[n]=m;
    }
    boolean isfull(){
        if(size==arr.length){
            return true;
        }
       return false;
    }
    public int Size(){
        return size;
    }
    Object get(int i){
        return arr[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    static void main() {

        arraylist<String> obj = new arraylist<>();

        for(int i = 0 ; i < 12 ; i++){
            char a = (char) (i+'a');
            obj.add(a);
        }
System.out.print(obj);

//        arraylist l = new arraylist();
//        l.add(1);
//        l.add(2);
//        l.add(4);
//        l.add(3);
//        l.add(5);
//        l.add(6);
//        System.out.println(l.remove());
//        System.out.println(l.remove());
//System.out.println(l.Size());
//l.add(100);
//System.out.println(l.get());
//l.set(1,1000);
//System.out.println(l.get(1));
//System.out.println("------------------------------------------------------------------");
//        for(int i = 0 ; i<l.Size() ; i++) {
//            System.out.println(l.get(i));
//        }
//        System.out.println(l.get());
//        for(int i = 0 ; i <17 ; i++){
//            l.add(i);
//        }
//        System.out.println(l);
    }
}
