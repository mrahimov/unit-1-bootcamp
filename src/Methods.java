import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.Integer.valueOf;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {

        System.out.println(calculateSquare(2)); //returns 4
        System.out.println(calculateSquare(3)); //returns 9
        System.out.println(calculateSquare(4)); //returns 16

        System.out.println(calculateSquareRoot(4)); //returns 2
        System.out.println(calculateSquareRoot(9)); //returns 3
        System.out.println(calculateSquareRoot(16)); //returns 4

        System.out.println(toLowerCase("Hello, World!")); //returns "hello, world!"

        System.out.println(isMultiple(2, 3)); //returns false);
        System.out.println(isMultiple(2, 4)); //returns true);
        System.out.println(isMultiple(5, 100)); //returns true);
        System.out.println(isMultiple(5, 101)); //returns false);

        prettyInteger(4); //prints "**** 4 ****"
        prettyInteger(10); //prints "********** 10 **********"

        System.out.println(random(1, 100)); // returns a random int between 1 and 100


    }


    private static int random(int x, int y) {

        Random random = new Random();

        int r = random.nextInt(y) + x;


        return r;
    }

    public static void prettyInteger(int n) {
        String x = "";
        String y = "";
        for (int i = 0; i < n; i++) {
            x = new StringBuilder(x).insert(0, '*').toString();
            y = new StringBuilder(y).insert(y.length(), '*').toString();
        }
        System.out.println(x + " " + n + " " + y);
    }


    private static boolean isMultiple(int x, int y) {

        if (y % 2 == 0)
        {
            return true;
        }
        return false;

    }

    private static String toLowerCase(String s) {

        return s.toLowerCase();

    }

    private static int calculateSquareRoot(int i) {

        return (int) Math.sqrt(i);

    }

    public static int calculateSquare(int x) {
        int y = x * x;
        return y;
    }
}



