package task4;

public class ShakerSort {
    private int comparisons;
    private int swaps;

    public void sort(int[] arr) {
        comparisons = 0;
        swaps = 0;
        boolean sorted = false;
        int left = 0;
        int right = arr.length - 1;
        while (!sorted) {
            sorted = true;
            for (int i = left; i < right; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                comparisons++;
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    sorted = false;
                }
            }
            left++;
        }
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swaps++;
    }
}
