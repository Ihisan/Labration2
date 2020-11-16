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
public class BubbleSort {

    public static void bubbleSort(int array[]) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //byter ut element
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printarraybeforebubblesort(int array[]) {
        System.out.println ("\nBefore bubblesort");
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] + " ");
        }
        System.out.println ();

    }
    public static void printarrayafterbubblesort(int array[]){
        System.out.println("\nAfter bubblesort");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort ();
        int array[] = {38,27,43,30,9,82,103};
        ob.printarraybeforebubblesort (array);
        ob.bubbleSort (array);
        printarrayafterbubblesort (array);

    }
}

