import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int start, int stop) {
        if (start < stop) {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp; //swapping edge elements
            reverse(arr, ++start, --stop); //continue
        }
    }
}