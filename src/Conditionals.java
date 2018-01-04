/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {

        System.out.println(isOdd(4));
        System.out.println(isMultipleOfThree(4));
        System.out.println(isOddAndIsMultipleOfThree(30));
        System.out.println(isOddAndIsMultipleOfThree2(9));
        fizzMultipleofThree(9);


    }

    public static boolean isOdd(int n) {

        if (n % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean isMultipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (n % 3 == 0 && n % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        if (isOdd(n) && isMultipleOfThree(n)) {
            return true;
        }
        return false;
    }

    public static void fizzMultipleofThree(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0) {
                System.out.println(i);
            }

        }
    }

}
