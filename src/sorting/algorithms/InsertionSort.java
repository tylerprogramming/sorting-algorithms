package sorting.algorithms;

public class InsertionSort {

    public void applySort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int previousElement = i - 1;

            // 5, 2, 4 -> 2, 5, 4

            while (previousElement >= 0 && array[previousElement] > currentElement) {
                array[previousElement + 1] = array[previousElement];
                previousElement--;
            }

            array[previousElement + 1] = currentElement;

            printArray(array);
        }
    }

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
