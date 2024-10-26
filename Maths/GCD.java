import java.util.*;

public class StackB {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 4, b = 8;  // Expected output is 4
        System.out.println("The GCD of the two numbers is " + gcd(a, b));
    }
}
