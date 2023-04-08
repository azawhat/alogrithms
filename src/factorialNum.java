/*

  factorial - definition of function
  n - number that needed to factorial
  return  - returning the function and n(number)*n-1

*/

public class factorialNum {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
