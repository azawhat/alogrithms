import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    /*    int[] arr = {10,7,32,3,5};
        int min = findMin(arr, arr.length);
        System.out.println("The Minimum number is " + min);
        int[] arr1 = {3,2,4,1};
        double avg = findAvg(arr1, arr1.length);
        System.out.println("The average number is "+ avg);
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
    public static double findAvg(int[] arr, int n){
        if (n==0){
            return arr[0];
        }
        else {
            double sum = findAvg(arr, n-1)*(n-1);
            sum += arr[n-1];
            return sum/n;

        }*/
        int n=10;
        System.out.println(isPrime(n));
    }

    public static String isPrime(int num){
        if (num%2 ==0)
            return("Prime");
        else
            return("Composite");
    }
}

