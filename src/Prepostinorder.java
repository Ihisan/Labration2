public class Prepostinorder extends BinaryTree {

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

    public static void printPostorder(Node tree){
        if (tree == null)
            return;

        printPostorder (tree.left);
        printPostorder (tree.right);
        System.out.print(tree.key + " ");
    }

    public static void main(String[] args) {
        //============ PreOrder,PostOrder, InOrder=======
        Node data = Prepostinorder.data ();
        System.out.print ("\nPrint PreOrder: ");
        Prepostinorder.printPreorder (data);
        System.out.print ("\nPrint in PostOrder: -> ");
        Prepostinorder.printPostorder (data);
        System.out.print ("\nPrint InOrder:");
        Prepostinorder.printInorder (data);
    }
}
