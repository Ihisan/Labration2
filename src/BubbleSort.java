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
       //====== BubbleSort===========
        BubbleSort ob = new BubbleSort ();
        int array[] = {38,27,43,30,9,82,103};
        ob.printarraybeforebubblesort (array);
        ob.bubbleSort (array);
        printarrayafterbubblesort (array);

    }
}

