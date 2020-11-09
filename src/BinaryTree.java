public class BinaryTree {
    Node root;

    class Node {
        Node left;
        Node right;
        int key;


        Node(int key) {
            this.key = key;
        }
    }

    public void insert(int key){
        root = insertRec (root,key);

    }


    public Node insertRec(Node tree, int key) {
        if(tree == null){
            tree = new Node (key);
            return tree;
        }
        if (key < tree.key){
            tree.left = insertRec (tree.left,key);
        }
        else if (key > tree.key){
            tree.right = insertRec (tree.right,key);
        }
        return tree;
    }

    public void printInOrderLeft(Node tree){
        if(tree == null){
            return;
        }
        printInOrderLeft (tree.left);
        System.out.println (tree.key);
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
