package SortingAlgo;
import java.util.*;
public class Lexicographical {
    public static void AlphabetS(String[] abc){
        int n = abc.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min = i;
            for(int j = i ; j < n ; j++){
                if(abc[j].compareTo(abc[min])<0){
                    min=j;
                }
            }
            String temp = abc[i];
            abc[i]=abc[min];
            abc[min]=temp;
        }
    }
    static void main() {
        String[] fruits = {"mango","Apple","banana","grapefruit","kiwi","orange","apricot","Pineapple","pear","fig","watermelon","apple","plum","Avocado"};
        AlphabetS(fruits);
        for(String a: fruits){
            System.out.print(a+" ");
        }
    }
}
