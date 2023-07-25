import sorting.abstracted.AbstractSort;
import sorting.algorithms.InsertionSort;

public class Main {
    public static void main(String[] args) {

        InsertionSort sort = new InsertionSort();

        int[] array = {5, 2, 4, 6, 1, 3, 7};

        sort.printArray(array);
        sort.applySort(array);
    }
}