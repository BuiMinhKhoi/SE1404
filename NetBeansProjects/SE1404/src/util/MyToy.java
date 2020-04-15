package util;

public class MyToy {

    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n mustbe between 0..15");
        }
        if (n == 0) {
            return 1;
        }
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
