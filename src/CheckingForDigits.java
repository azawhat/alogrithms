public class CheckingForDigits {

    public static String loop(String letter) {
        return recFunction(letter.split(""), 0, letter.length());
    }
    static String recFunction(String[] arr, int pos,  int stop) {
        if (pos < stop) {
            if (isNum(arr[pos])) {
                return recFunction(arr, ++pos, stop);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
    static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}