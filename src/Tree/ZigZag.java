package Tree;
import java.util.*;
public class ZigZag {
    public static class tree{
        tree left;
        tree right;
        int val;
        tree(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static int H(tree root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+(Math.max(H(root.left),H(root.right)));
    }
    public static void print(tree node , int n){
        if(node==null) return;
        if(n==0) System.out.print(node.val+" ");
        print(node.left,n-1);
        print(node.right , n-1);
    }
    public static void print1(tree node , int n){
        if(node==null) return;
        if(n==0) System.out.print(node.val+" ");
        print(node.right , n-1);
        print(node.left,n-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        tree a = new tree(sc.nextInt());
        tree b = new tree(sc.nextInt());
        tree c = new tree(sc.nextInt());
        a.left = b;
        a.right = c;
        tree d = new tree(sc.nextInt());
        tree e = new tree(sc.nextInt());
        b.left = d;
        b.right = e;
        tree f = new tree(sc.nextInt());
        tree g = new tree(sc.nextInt());
        c.left = f;
        c.right = g;
        int height = H(a);
        System.out.println(height);
        for(int i = 0 ; i <= height ; i++){
          if(i%2==0) print(a,i);
          else print1(a,i);
          System.out.println();

        }
    }
}
