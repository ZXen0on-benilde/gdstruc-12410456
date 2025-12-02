public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;


        int[] selectionArray = numbers.clone();
        int[] bubbleArray    = numbers.clone();


        System.out.println("\nBefore bubble sort:");
        printArrayElements(bubbleArray);

        bubbleSort(bubbleArray);

        System.out.println("\nAfter bubble sort:");
        printArrayElements(bubbleArray);


        System.out.println("\nBefore selection sort:");
        printArrayElements(selectionArray);

        selectionSort(selectionArray);

        System.out.println("\nAfter selection sort:");
        printArrayElements(selectionArray);
    }

    private static void bubbleSort(int[] arr) {

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (arr[i] < arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    private static void selectionSort(int[] arr) {

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            int smallestIndex = 0;


            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] < arr[smallestIndex]) {
                    smallestIndex = i;
                }
            }


            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
