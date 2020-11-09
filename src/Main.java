public class Main {

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort ();
        int arr[] = {38,27,43,3,9,82,10};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
