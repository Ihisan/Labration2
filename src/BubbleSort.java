/*
1. Implementera bubble sort
Er implementation skall kunna ta en array av heltal och efter sortering
 med bubble sort resultera i en sorterad array, t.ex. [3,6, 65,11, 5,1] -> [1, 3, 5, 7, 11, 65]
 */
<<<<<<< HEAD

 public class BubbleSort extends BinaryTree{

    void bubbleSort(int[] array)
    {
=======
public class BubbleSort {

    public static void bubbleSort(int array[]) {
>>>>>>> a0ec87adbcf16a4be9b46ae02a22745175ddd63e
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
<<<<<<< HEAD
    //Skriver ut Array
    void printArray(int[] array)
    {
        int n = array.length;
        for (int j : array) System.out.print(j + " ");
=======
>>>>>>> a0ec87adbcf16a4be9b46ae02a22745175ddd63e

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

