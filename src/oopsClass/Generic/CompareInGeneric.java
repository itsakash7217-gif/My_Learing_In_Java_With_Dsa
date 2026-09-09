package oopsClass.Generic;

public class CompareInGeneric implements Comparable<CompareInGeneric>{
    int marks;
    float proxy;
    CompareInGeneric(int marks, float proxy) {
        this.marks = marks;
        this.proxy = proxy;
    }
    @Override
    public int compareTo(CompareInGeneric o) {
        int diff =(int)(this.marks - o.marks);
        return diff;
    }
    @Override
    public String toString() {
        return marks+"";
    }
}
