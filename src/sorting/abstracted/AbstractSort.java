package sorting.abstracted;

public abstract class AbstractSort {

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public abstract void applySort(int[] array);
}
