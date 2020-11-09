import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class BinaryTree {
     Node root;

     static class Node {
        Node left;
        Node right;
        int key;

        Node(int key) {
            this.key = key;
        }
    }

        static int value(Node root) {
            int min = root.key;
            while (root.left != null) {
                min = root.left.key;
                root = root.left;
            }
            return min;
        }


    public void insert(int key) {
        root = insertRec (root, key);

    }


    public Node insertRec(Node tree, int key) {
        if (tree == null) {
            tree = new Node (key);
            return tree;
        }
        if (key < tree.key) {
            tree.left = insertRec (tree.left, key);
        } else if (key > tree.key) {
            tree.right = insertRec (tree.right, key);
        }
        return tree;
    }


    public void deleteKey(int key){
        root = deleteRec(root, key);
    }

    public static Node deleteRec(Node tree, int key){
        if (tree == null) return tree;
        if (key < tree.key)
            tree.left=deleteRec (tree.left,key);
        else if(key > tree.key)
            tree.right = deleteRec (tree.right,key);

        else{
            if(tree.left == null) return tree.right;
            else if (tree.right == null) return tree.left;

            tree.key = value (tree.right);

            tree.right = deleteRec (tree.right,tree.key);
        }
        return tree;
    }

    private void printInOrderLeft(Node tree){
        if(tree == null){
            return;
        }
        printInOrderLeft (tree.left);
        System.out.print (tree.key + " ");
        printInOrderLeft (tree.right);
    }
    public void printInOrderLeft(){
        printInOrderLeft (root);
    }

    public static void printPreorder(Node tree){
        if (tree == null)
            return;

        System.out.print (tree.key + " ");
        printPreorder (tree.left);
        printPreorder (tree.right);


    }

    public static void printInorder(Node tree){
         if (tree == null)
             return;
         printInorder (tree.left);
        System.out.print(tree.key + " ");
        printInorder (tree.right);



    }

    public void printPostorder(Node tree){
         if (tree == null)
             return;

         printPostorder (tree.left);
         printPostorder (tree.right);
        System.out.print(tree.key + " ");
    }

    public static Node data(){
         Node a = new Node (1);
         Node b = new Node (2);
         Node c = new Node (3);
         Node d = new Node (4);
         Node e = new Node (5);
         Node f = new Node (6);
         Node g = new Node (7);

         a.left = b;
         a.right = g;
         b.left = c;
         b.right = d;
         c.left = e;
         e.right = f;

         return a;
    }




    /*public static void main(String[] args) {
        Node data = data ();
    }*/
    /* public void printInOrderLeft(Node tree){
        if(tree == null){
            return;
        }
        printInOrderLeft (tree.left);
        System.out.print (tree.key + " ");
        printInOrderLeft (tree.right);
    }
    public void printInOrderLeft(){
        printInOrderLeft (root);
    }

    public void printInOrderRight(){
        printInOrderRight (root);
    }
    public void printInOrderRight(Node tree){
        if (tree==null){
            return;
        }
        printInOrderRight (tree.right);
        System.out.print (tree.key + " ");
        printInOrderRight (tree.left);
    }*/



}
