/*
1. Implementera bubble sort
Er implementation skall kunna ta en array av heltal och efter sortering
 med bubble sort resultera i en sorterad array, t.ex. [3,6, 65,11, 5,1] -> [1, 3, 5, 7, 11, 65]
 */

 public class BubbleSort extends BinaryTree{

    void bubbleSort(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    //Sorterar
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    //Skriver ut Array
    void printArray(int[] array)
    {
        int n = array.length;
        for (int j : array) System.out.print(j + " ");

    }



}
