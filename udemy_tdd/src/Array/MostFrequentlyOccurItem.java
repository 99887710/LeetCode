package Array;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentlyOccurItem {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        Map<Integer, Integer> count = new HashMap<>();
        int maxVal = 0;
        int maxKey = arr[0];

        for (int item : arr) {
            if (count.containsKey(item)) {
                count.put(item, count.get(item) + 1);
            } else {
                count.put(item, 1);
            }
        }

        for (Map.Entry entry : count.entrySet()) {
            if (Integer.parseInt(entry.getValue().toString()) > maxVal) {
                maxVal = Integer.parseInt(entry.getValue().toString());
                maxKey = Integer.parseInt(entry.getKey().toString());
            }
        }

        System.out.println("max key: " + maxKey +" ,max value: " + maxVal);
    }
}
