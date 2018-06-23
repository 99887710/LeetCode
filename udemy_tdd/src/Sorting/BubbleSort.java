package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        int arrLength = arr.length;

        for (int i=0; i<arrLength-1; i++) {
            for (int j=0; j<(arrLength -1) - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int k=0; k<arr.length; k++) {
            System.out.print(arr[k]);
        }
    }
}
