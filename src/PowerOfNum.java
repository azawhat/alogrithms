public class PowerOfNum {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double half = power(a, n/2);
            return half * half;
        } else {
            return a * power(a, n-1);
        }
    }
}
