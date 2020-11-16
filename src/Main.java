public class Main {

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort ();
        BinaryTree leef = new BinaryTree ();
        System.out.println("Array Before Bubble Sort");
        int[] arr ={3,6, 65,11, 5,1};
        ob.printArray(arr);
        System.out.println ("\n---------------------------------------------------------");

        System.out.println("Array after Bubble Sort");
        ob.bubbleSort(arr);
        ob.printInOrderLeft ();
      for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println ("\n---------------------------------------------------------");


        ob.insert (1);
        ob.insert (10);
        ob.insert (9);
        ob.insert (12);
        ob.insert (14);
        ob.insert (17);
        ob.insert (4);
        ob.insert (30);

         ob.deleteKey (3);
            ob.printInOrderLeft ();
            ob.printInOrderRight ();

            leef.insert(1);
            leef.insert(10);
            leef.insert(9);
            leef.insert(12);
            leef.insert(14);
            leef.insert(17);
            leef.insert(4);
            leef.insert(30);
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("Inorder traversal of the given tree");
            leef.printInOrderLeft();
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("\nDelete 1");
            leef.deleteKey(1);
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("Inorder traversal of the modified tree");
            leef.printInOrderLeft();
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("\nDelete 12 ");
            leef.deleteKey(12);
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("Inorder after deleting 12");
            leef.printInOrderLeft();
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("\nDelete 30");
            leef.deleteKey(30);
        System.out.println ("\n---------------------------------------------------------");
            System.out.println("Inorder after deleting 30");
            leef.printInOrderLeft();
        System.out.println ("\n---------------------------------------------------------");

        }
    }

