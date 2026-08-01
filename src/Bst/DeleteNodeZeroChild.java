package Bst;
import java.util.*;
public class DeleteNodeZeroChild {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    static void display(Node root){
        if(root==null) return;
        System.out.print(" -> "+root.data);
        display(root.left);
        display(root.right);
    }
    static void delete(Node root,int data){
        if(root==null) return;
        if(root.left!=null){
        if(root.left.data==data){
            root.left = null;
            return;
        }}
        if(root.right!=null){
        if(root.right.data==data){
            root.right = null;
            return;
        }}
        if(root.left!=null && root.data>data )delete(root.left,data);
        if(root.right!=null && root.data<data) delete(root.right,data);
        return;
    }
    static void deleteOneLeaf(Node root,int data){
        if(root==null) return;
        if(root.left!=null && root.data>data) {

            if (root.left.data == data) {
                if(root.left.left == null && root.left.right == null){
                    root.left = null;
                    return;
                }
                else if (root.left.right != null && root.left.left==null) {
                    root.left = root.left.right;
                    return;
                }
                else if(root.left.left!=null && root.left.right==null) {
                    root.left = root.left.left;
                    return;
                }else if(root.left.left!=null && root.left.right!=null){
                    Node temp = root.left;
                    Node predecessor=temp.left;
                    while(predecessor.right!=null) predecessor=predecessor.right;
                    deleteOneLeaf(temp,predecessor.data);
                    predecessor.left =temp.left;
                    predecessor.right =temp.right;
                    root.left=predecessor;
                }
            }
        }
        if(root.right!=null && root.data<data) {
            if (root.right.data == data) {
                if(root.right.left == null && root.right.right == null){
                    root.right = null;
                }
                else if (root.right.right != null && root.right.left==null) {
                    root.right = root.right.right;
                    return;
                }
                else if(root.right.left != null && root.right.right==null) {
                    root.right = root.right.left;
                    return;
                }else if(root.right.left!=null && root.right.right!=null){
                    Node temp = root.right;
                    Node predecessor=temp.left;
                    while(predecessor.right!=null) predecessor=predecessor.right;
                    deleteOneLeaf(temp,predecessor.data);
                    predecessor.left =temp.left;
                    predecessor.right =temp.right;
                    root.right=predecessor;
                }
            }
        }
        if(root.left!=null) deleteOneLeaf(root.left,data);
        if(root.right!=null) deleteOneLeaf(root.right,data);
    }
    static void main() {
        Node dummy = new Node(Integer.MAX_VALUE);
        Node root = new Node(50);
        Node a = new Node(20);
        Node b = new Node(60);
        root.left=a;
        root.right=b;
        Node c = new Node(17);
        Node d = new Node(34);
        a.left=c;
        a.right=d;
        Node e = new Node(55);
        Node f = new Node(89);
        b.left=e;
        b.right=f;
        Node g = new Node(10);
        c.left=g;
        Node h = new Node(28);

        d.left=h;
        Node i = new Node(70);
        f.left=i;
        Node j = new Node(14);
        g.right=j;
        dummy.left=root;
        display(root);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        //delete(root,key);
        deleteOneLeaf(dummy,key);
        System.out.println();
        display(dummy.left);
    }
}
