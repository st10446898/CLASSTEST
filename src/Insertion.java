//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Insertion {
    public static void main(String[] args) {
        int[] arr = {20, 5, 15, 10, 3, 17, 7};

        System.out.println("Array:");
        printArray(arr);

        insertionSort(arr);
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("\nStep " + i + ": Insert " + key + " into the sorted sectionn.");

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

                printArray(arr);
            }
            arr[j + 1] = key;

            printArray(arr);
        }

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
