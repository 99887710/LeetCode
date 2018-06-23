package Sorting;

public class MergeSort {

    //to split the array into two sub array
    public void mergetSort(int[] arr, int from, int to) {
        if (from >= to) {
            return;
        }

        int middle = (from + to) / 2;
        mergetSort(arr, from, middle);
        mergetSort(arr, middle + 1, to);
        merge(arr, from, middle, to);
    }

    private void merge(int[] arr, int from, int middle, int to) {
        int leftLength = middle - from  + 1;
        int rightLength = to - middle;
        int allLength = leftLength + rightLength;
        int lp = 0;
        int rp = 0;
        int[] left = new int[leftLength + 1];
        int[] right = new int[rightLength + 1];

        for (int i=0; i<leftLength; i++) {
            left[i] = arr[from + i];
        }

        for (int i=0; i<rightLength; i++) {
            right[i] = arr[middle + 1 + i];
        }

        left[leftLength] = Integer.MAX_VALUE;
        right[rightLength] = Integer.MAX_VALUE;

        for (int j=from; j <= to; j++) {
            if (left[lp] <= right[rp]) {
                arr[j] = left[lp];
                lp++;
            } else {
                arr[j] = right[rp];
                rp++;
            }
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] input = {10, 18, 4, 16, 9, 1, 8, 3, 68};
        ms.mergetSort(input, 0, input.length - 1);

        for (int i=0; i<input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
    }
}
