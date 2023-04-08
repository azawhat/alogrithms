/*

  fibonacci - definition of function
  n - numbers to find fibonacci of that number
  return  - returning fibonacci of number

*/

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
