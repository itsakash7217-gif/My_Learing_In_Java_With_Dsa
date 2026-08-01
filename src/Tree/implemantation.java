package Tree;
public class implemantation {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    static void print(Node root){
        if(root==null) return;
        System.out.print(root.data+" -> ");
        if(root.left!=null) System.out.print(root.left.data+" , ");
        else System.out.print("null , ");
        if(root.right!=null) System.out.println(root.right.data+" ");
        else System.out.println("null");
        print(root.left);
        print(root.right);
    }
    static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);
    }
    static int Sum(Node root){
        if(root==null) return 0;
        return root.data+ Sum(root.left) + Sum(root.right);
    }
    static int Max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(Max(root.left), Max(root.right)));
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
        Node g = new Node(8);
       // f.right=g;
        print(root);
        System.out.print("Size of the Tree is :"+size(root));
        System.out.println();
        System.out.print("Tota sum of the Tree Nodes is :" +Sum(root));
        System.out.println();
        System.out.print("Max Node value in Tree is :" +Max(root));
        System.out.println();
        int height=Height(root);
        System.out.print("Height os the tree is :" +height);
    }
}
