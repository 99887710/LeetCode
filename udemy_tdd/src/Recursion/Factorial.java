package Recursion;

public class Factorial {

    public int fac(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fac(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int res = f.fac(5);
        System.out.println(res);
        System.out.println("Expected: 120 ? : " + String.valueOf(120 == res));
    }
}
