package Recursion;

/*
*  how many ways of reaching nth stair?
*  1 or 2 steps for each climbing
* */
public class ClimbStairs {

    public static int climb(int n) {
        if (n <= 2) {
            return n;
        }
        return climb(n-1) + climb(n-2);
    }

    public static void main(String[] args) {
        System.out.println("7 stirs: " + climb(10));
    }
}
