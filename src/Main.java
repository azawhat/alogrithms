import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*      FIRST TASK

        int[] arr = {10,7,32,3,5};
        int min = findMin(arr, arr.length);
        System.out.println("The Minimum number is " + min);

        END OF FIRST TASK
    */

    /*
        SECOND PROBLEM

        int[] arr1 = {3,2,4,1};
        double avg = findAvg(arr1, arr1.length);
        System.out.println("The average number is "+ avg);

        END OF THE SECOND PROBLEM

    } */
        /*

    FUNCTION FOR THE FIRST TASK


    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }

    END OF THE FUNCTION

         */


        /*      FUNCTION FOR THE SECOND TASK


    public static double findAvg(int[] arr, int n){
        if (n==0){
            return arr[0];
        }
        else {
            double sum = findAvg(arr, n-1)*(n-1);
            sum += arr[n-1];
            return sum/n;

        }

        END OF THE FUNCTION
        */

        /* START OF THE THIRD FUNCTION THAT FINDS IS PRIME OR NOT

        int n=10;
        System.out.println(isPrime(n));


     public static String isPrime(int num){
        if (num%2 ==0)
            return("Prime");
        else
            return("Composite");

            END OF THE THIRD PROBLEM*/



        /*int n = 5;
        int factorial = factorialNum.factorial(n);
        System.out.println(factorial);*/

        /*int n = 5;
        int fibonacci = Fibonacci.fibonacci(n);
        System.out.println(fibonacci);*/


        /*double a = 2;
        int n = 10;
        double result = PowerOfNum.power(a, n);
        System.out.println(result);*/

        /*
        System.out.println("Length ");
        int n = sc.nextInt();
        System.out.println("Write "+ " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        ReverseArray.reverseArray(arr);
        System.out.println(Arrays.toString(arr));*/

        /*;
        System.out.println();
        String n = sc.nextLine();
        System.out.println(CheckingForDigits.loop(n));*/


        /*int c = sc.nextInt();
        int p =sc.nextInt();
        int ans = BinomialCoeff.func(c,p);
        System.out.println(ans);*/

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = GCD.findGCD(a,b);
        System.out.println(gcd);
    }
}

