//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bubble {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 25, 29, 27, 22, 12, 8};

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            boolean swapped = false;

            // Traverse the array
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array
