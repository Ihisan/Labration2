/*
1. Implementera bubble sort
Er implementation skall kunna ta en array av heltal och efter sortering med bubble sort resultera i en sorterad array, t.ex. [3,6, 65,11, 5,1] -> [1, 3, 5, 7, 11, 65]

2. Fortsätt med implementationen av ett binärt sökträd
 a) Lägg till metoder för att ta bort ett element, tänk på fallen:
    1. Noden har inga barn
    2. Noden har ett barn
    3. Noden har två barn
    Tänk också på att ni kan behöva hantera fallet där det som skall tas bort ligger i rot-noden.
  b) Lägg till metoder för traversering
    1. pre-order
    2. in-order
    3. reverse in-order
    4. post-order
    För att visa att traverseringen fungerar räcker det att skriva ut värdet i varje nod
 */
public class BubbleSort {

    void bubbleSort(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
