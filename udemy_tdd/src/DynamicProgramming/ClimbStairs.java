package DynamicProgramming;

//DP version
public class ClimbStairs {
    int stairs;

    public ClimbStairs(int stairs) {
        this.stairs = stairs;
    }

    public int count() {
        if (stairs <= 2) {
            return stairs;
        }
        int[] dp = new int[stairs + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=stairs; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[stairs];
    }

    public static void main(String[] args) {
        int stairs = 3;
        ClimbStairs cs = new ClimbStairs(stairs);
        int numOfWays = cs.count();
        System.out.println("num of ways: "+ numOfWays);
    }
}
