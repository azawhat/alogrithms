public class BinomialCoeff {
    public static int func(int n, int p) {
        if (n == p) {
            return 1;
        }
        else if (p==0){
            return 1;
        }
        else
            return func(n-1, p-1) + func(n-1, p);
    }
}