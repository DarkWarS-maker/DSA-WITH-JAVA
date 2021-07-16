import java.util.*;

public class AnyBaseMulti {

    public static Scanner sc = new Scanner(System.in);

    public static int multiWithSingleDigit(int b, int n1, int d) {
        int ans = 0;
        int carry = 0;
        int mult = 1;
        while (n1 != 0 || carry != 0) {
            int res = carry + (n1 % 10) * d;
            n1 /= 10;
            int digit = res % b;
            carry = res / b;
            ans += (digit * mult);
            mult *= 10;
        }

        return ans;
    }

    public static int anyBaseAdd(int n1, int n2, int b) {

        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int sum = carry + n1 % 10 + n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int digit = sum % b;
            carry = sum / b;
            ans += digit * pow;
            pow *= 10;
        }
        return ans;

    }

    public static int multiAnyBaseNum(int b, int n1, int n2) {
        int ans = 0;
        int multi = 1;
        while (n2 != 0) {
            int rem = n2 % 10;
            n2 /= 10;
            int sum = multiWithSingleDigit(b, n1, rem) * multi;

            ans = anyBaseAdd(ans, sum, b);

            multi *= 10;
        }

        return ans;

    }

    public static void main(String args[]) {
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = multiAnyBaseNum(b, n1, n2);
        System.out.println(ans);
    }

}

// public class AnyBaseMulti{

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int b = scn.nextInt();
// int n1 = scn.nextInt();
// int n2 = scn.nextInt();

// int d = getProduct(n1, n2,b);
// System.out.println(d);
// }

// public static int anyBaseAddition(int n, int m, int b) {
// int pow = 1;
// int ans = 0, carry = 0;
// while (n != 0 || m != 0 || carry != 0) {
// int sum = carry + n % 10 + m % 10;
// n /= 10;
// m /= 10;

// int digit = sum % b;
// carry = sum / b;

// ans += digit * pow;
// pow *= 10;
// }

// return ans;
// }

// public static int multiplyNumberWithDigit(int n, int d, int b) {
// int ans = 0, pow = 1, carry = 0;
// while (n != 0 || carry != 0) {
// int prod = carry + (n % 10) * d;
// n /= 10;

// int digit = prod % b;
// carry = prod / b;

// ans += digit * pow;
// pow *= 10;
// }

// return ans;
// }

// public static int getProduct(int n, int m, int b) {

// int ans = 0, pow = 1;

// while (m != 0) {
// int d = m % 10;
// m /= 10;
// int prodRes = multiplyNumberWithDigit(n, d, b) * pow;

// ans = anyBaseAddition(ans, prodRes, b);
// pow *= 10;
// }

// return ans;
// }

// }
