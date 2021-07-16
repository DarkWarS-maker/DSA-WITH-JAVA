import java.util.*;

public class DTAB {
    public static Scanner sc = new Scanner(System.in);

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int mult = 1;
        while (n != 0) {
            int rem = n % b;
            n /= b;
            ans += rem * mult;
            mult *= 10;
        }
        return ans;
    }
    public static void main(String asrgs[]) {
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = decimalToAnyBase(n, b);
        System.out.println(ans);

    }

}
