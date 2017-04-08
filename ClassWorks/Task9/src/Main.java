/**
 * Created by Student8 on 08.04.2017.
 */
public class Main {
    public static boolean IsDigit (char c) {
        if ((c >= '0' ) && (c <= '9')) {
            System.out.println("correct");
            return true;

        }
        return false;
    }
    public static int intFromChar (char c) {
        if (c == '9') {
            return 9;
        }
        return 0;
    }

    public static void main(String[] args) {
        IsDigit('7');
        IsDigit('g');
        System.out.println(intFromChar('9'));


    }
}
