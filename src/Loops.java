/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {

        printNums();
        printNums2();
        printNum3(10);
        printEvenNum(10);
        printSumNum();
        printSumNum(10000);
        printStringNTime(10, "C4Q");
        printString(2, "Fellow");
        printFibonnaciNum();
        printFibonnaciSumNum();
        printFibonnaciSumNum(10);


    }

    public static void printNums() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printNums2() {

        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

    }

    public static void printNum3(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }

    public static void printEvenNum(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSumNum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printSumNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printStringNTime(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(s);

            }
        }
        System.out.println("");
    }

    public static void printString(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                s = s + s;
            }
        }
        System.out.println(s);
    }

    public static void printFibonnaciNum() {
        int x = 1;
        int y = 0;
        for (int i = 0; i < 10; i++) {

            int b = x + y;
            y = x;
            x = b;
            System.out.println(x);

        }
    }

    public static void printFibonnaciSumNum() {
        int x = 1;
        int y = 0;
        int b = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {

            b = x + y;
            y = x;
            x = b;
            sum += x;

        }
        System.out.println(sum);
    }

    public static void printFibonnaciSumNum(int n) {
        int x = 1;
        int y = 0;
        int b = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            b = x + y;
            y = x;
            x = b;
            sum += x;

        }
        System.out.println(sum);

    }
}
