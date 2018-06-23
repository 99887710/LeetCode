package MaxAndMinNumer;

public class MaxAndMinNumber {
    private int max;
    private int min;
    private int[] nums;

    public void find(int[] nums) {
        this.nums = nums;
        if (nums.length > 0) {
            findMaxAndMin();
        }
    }

    private void findMaxAndMin() {
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
