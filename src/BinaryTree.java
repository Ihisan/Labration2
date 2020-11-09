import org.w3c.dom.*;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static Node root;

    class Node {
        Node left;
        Node right;
        int key;


        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

        int value(Node root) {
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


    void deleteKey(int key){
        root = deleteRec(root, key);
    }

    Node deleteRec(Node tree, int key){
        if (tree == null) return tree;
        if (key<tree.key)
            tree.left=deleteRec (tree.left,key);
        else if(key > tree.key)
            tree.right = deleteRec (tree.left,key);

        else{
            if(tree.left == null) return tree.right;
            else if (tree.right == null) return tree.left;

            tree.key = value (tree.right);

            tree.right = deleteRec (tree.right,tree.key);
        }
        return tree;
    }



    public void printInOrderLeft(Node tree){
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
        System.out.println (tree.key);
        printInOrderRight (tree.left);
    }



}
