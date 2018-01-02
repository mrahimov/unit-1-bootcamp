
/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {



    System.out.println(isOdd(2));
    System.out.println(isOdd(3));
    printHelloWorld();

    int [] x = {2,3,4,15,16,7,8};
    System.out.println(greatestCommonFactor(x));

  }
  public static boolean isOdd(int x) {

    if (x % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void printHelloWorld() {
    System.out.println("Hello World");
  }

  public static int greatestCommonFactor(int[] x) {
    int gretestNumber = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] > gretestNumber) {
        gretestNumber = x[i];

      }

    }
    return gretestNumber;
  }
}
