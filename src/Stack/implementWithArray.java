package Stack;

import java.sql.SQLOutput;

public class implementWithArray {
    public static class stack{
        int[] arr = new int[50];
        int x = 0;
        void Push(int a){
            arr[x] = a;
            x++;
            //print(arr);
        }
        int Peek(){
            //print(arr);
            if(arr.length==0) return -1;
            return arr[x-1];
        }
        int Pop(){
            int a = arr[x-1];
            arr[x-1]=0;
            x--;
         //   print(arr);
            return a;
        }
        void print(){
            for(int a=0;a<x;a++) {
                System.out.print(arr[a] + " ");
            }
        }
    }
    static void main() {
        stack st = new stack();
        st.Push(1);
        st.Push(2);
        st.Push(3);
        st.Push(4);
        st.Push(5);
        System.out.println(st.Peek());
        System.out.println(st.Pop());
        System.out.println(st.Peek());
        st.print();
    }
}

