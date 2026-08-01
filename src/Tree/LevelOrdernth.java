package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrdernth {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    static void qlevel(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if (temp.right!=null)q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();
        }
    }
    static void level(Node root,int n){
        if(root==null) return;
        if(n==1) System.out.print(root.data+" ");
        level(root.left,n-1);
        level(root.right,n-1);
    }
    static int Height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(Height(root.left), Height(root.right));
    }
    static void main() {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left=e;
        b.right=f;
        for(int i = 1 ; i <= Height(root)+1;i++) {
            level(root, i);
            System.out.println();
        }
        qlevel(root);
    }
}
