package another;

/**
 * Created by Vardan Aivazian
 * Date: 3/15/2019
 * Time: 5:12 PM
 */
public class Gcd {

    public static void main(String[] args) {
        int a = 1680, b = 640;
        System.out.println("Greatest common divisor of " + a + " and " + b + " is " + gcdRec(a, b));
    }

    private static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return a + b;
    }


    private static int gcdRec(int a, int b) {
        if (b == 0) return a;
        return gcdRec(b, a % b);
    }

}
