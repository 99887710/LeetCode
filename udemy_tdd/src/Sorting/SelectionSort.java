package Sorting;

public class SelectionSort {

    int[] arr;
    int length;

    public SelectionSort(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    public int getArrLength() {
        return length;
    }

    public int[] sort() {
        for (int i=0; i<length-1; i++) {
            int indexOfSmallest = i;
            for (int j=i+1; j<length; j++) {
                if (arr[j] < arr[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            //swap
            int temp = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public void print() {
        String result = "";
        for (int el : arr) {
            result += el + " ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5 ,6 ,1, 2};
        SelectionSort ss = new SelectionSort(arr);
        ss.sort();
        ss.print();

    }
}
