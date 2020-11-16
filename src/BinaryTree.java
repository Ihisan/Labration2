<<<<<<< HEAD
import org.w3c.dom.*;

import java.util.LinkedList;
import java.util.Queue;

/*
2. Fortsätt med implementationen av ett binärt sökträd
 a) Lägg till metoder för att ta bort ett element, tänk på fallen:
    1. Noden har inga barn
    2. Noden har ett barn
    3. Noden har två barn
    Tänk också på att ni kan behöva hantera fallet där det som skall tas bort ligger i rot-noden.
 */
public class BinaryTree {
    Node root;

    static class Node {
=======
public class BinaryTree {
    Node root;

    static class Node extends Prepostinorder {
>>>>>>> a0ec87adbcf16a4be9b46ae02a22745175ddd63e
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
            tree = new Node(key);
            return tree;
        }
        if (key < tree.key) {
            tree.left = insertRec (tree.left, key);
        } else if (key > tree.key) {
            tree.right = insertRec (tree.right, key);
        }
        return tree;
    }


    public void deleteKey(int key) {
        root = deleteRec (root, key);
    }

    public static Node deleteRec(Node tree, int key) {
        if (tree == null) return tree;
        if (key < tree.key)
            tree.left = deleteRec (tree.left, key);
        else if (key > tree.key)
            tree.right = deleteRec (tree.right, key);

        else {
            if (tree.left == null) return tree.right;
            else if (tree.right == null) return tree.left;

            tree.key = value (tree.right);

            tree.right = deleteRec (tree.right, tree.key);
        }
        return tree;
    }

    private void printInOrderLeft(Node tree) {
        if (tree == null) {
            return;
        }
        printInOrderLeft (tree.left);
        System.out.print (tree.key + " ");
        printInOrderLeft (tree.right);
    }

    public void printInOrderLeft() {
        printInOrderLeft (root);
    }
}