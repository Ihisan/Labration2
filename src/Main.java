import org.w3c.dom.Node;

/*
1. Implementera bubble sort
Er implementation skall kunna ta en array av heltal och efter sortering med bubble sort resultera i en sorterad array, t.ex. [3,6, 65,11, 5,1] -> [1, 3, 5, 7, 11, 65]
=======
2. Fortsätt med implementationen av ett binärt sökträd
 a) Lägg till metoder för att ta bort ett element, tänk på fallen:
    1. Noden har inga barn
    2. Noden har ett barn
    3. Noden har två barn
    Tänk också på att ni kan behöva hantera fallet där det som skall tas bort ligger i rot-noden.
    =======
  b) Lägg till metoder för traversering
    1. pre-order
    2. in-order
    3. reverse in-order
    4. post-order
    För att visa att traverseringen fungerar räcker det att skriva ut värdet i varje nod
 */
public class Main {

    public static void main(String[] args) {
        //=======Binary Search Tree========
        
        BinaryTree tree = new BinaryTree ();
        tree.insert (1);
        tree.insert (10);
        tree.insert (9);
        tree.insert (12);
        tree.insert (14);
        tree.insert (17);
        tree.insert (30);
        System.out.println ("Preorder of the given tree");
        tree.printInOrderLeft ();
        System.out.println ("\nInorder traversal");
        tree.printInOrderLeft ();
        System.out.println ("\nDelete 1");
        tree.deleteKey (1);
        System.out.println ("Inorder traversal of the modified tree");
        tree.printInOrderLeft ();
        System.out.println ("\nDelete 10 ");
        tree.deleteKey (10);
        System.out.println ("Inorder left after deleting 10");
        tree.printInOrderLeft ();
        System.out.println ("\nDelete 30");
        tree.deleteKey (30);
        System.out.println ("Inorder after deleting 30");
        tree.printInOrderLeft ();
        
    }
}
