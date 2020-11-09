public class Main {

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort ();
        BinaryTree leef = new BinaryTree ();
        int arr[] = {38,27,43,3,9,82,10};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        /*ob.printArray(arr);
        ob.insert (1);
        ob.insert (10);
        ob.insert (9);
        ob.insert (12);
        ob.insert (14);
        ob.insert (17);
        ob.insert (4);
        ob.insert (30);
        //ob.printInOrderLeft ();
        ob.deleteKey (3);
        ob.printInOrderLeft ();
        ob.printInOrderRight ();*/

        leef.insert (1);
        leef.insert (10);
        leef.insert (9);
        leef.insert (12);
        leef.insert (14);
        leef.insert (17);
        leef.insert (4);
        leef.insert (30);
        System.out.println ("Inorder traversal of the given tree");
        leef.printInOrderLeft ();
        System.out.println ("\nDelete 1");
        leef.deleteKey (1);
        System.out.println ("Inorder traversal of the modified tree");
        leef.printInOrderLeft ();
        System.out.println ("\nDelete 12 ");
        leef.deleteKey (12);
        System.out.println ("Inorder after deleting 12");
        leef.printInOrderLeft ();
        System.out.println ("\nDelete 30");
        leef.deleteKey (30);
        System.out.println ("Inorder after deleting 30");
        leef.printInOrderLeft ();




    }
}
