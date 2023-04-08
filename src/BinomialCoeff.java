/*

  binomial - definition of function
  n, p  - numbers that is needed in the formula
  return  - returning addition of the function by the formula

*/

public class BinomialCoeff {
    public static int binomial(int n, int p) {
        if (n == p) {
            return 1;
        }
        else if (p==0){
            return 1;
        }
        else
            return binomial(n-1, p-1) + binomial(n-1, p);
    }
}