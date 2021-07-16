import java.util.*;

public class AnyBaseSub {

    public static Scanner sc = new Scanner(System.in);

    public static int subInAnyBase(int b, int n1, int n2) {
        int ans = 0;
        int borrow = 0;
        int mul = 1;

        while (n1 != 0 || n2 != 0 || borrow != 0) {
            int sub = borrow + n2 % 10 - n1 % 10;
            n1/=10;
            n2/=10;
            if (sub < 0) {
                sub += b;
                borrow = -1;
            } else {
                borrow = 0;
            }
            ans += sub * mul;
            mul *= 10;

        }
        return ans;
    }

    public static void main(String args[]) {
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = subInAnyBase(b, n1, n2);
        System.out.println(ans);
    }

}
