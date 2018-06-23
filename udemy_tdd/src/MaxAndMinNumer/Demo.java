package MaxAndMinNumer;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 8, -10};
        MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();
        maxAndMinNumber.find(nums);
        System.out.println("max: " + maxAndMinNumber.getMax());
        System.out.println("min: " + maxAndMinNumber.getMin());
    }
}
