/*

  reverseArray - definition of function to reverse array
  reverse - definition of function to reverse
  arr - array
  start - to find start
  stop - to define stop

*/
public class ReverseArray {
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int start, int stop) {
        if (start < stop) {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp;
            reverse(arr, ++start, --stop);
        }
    }
}