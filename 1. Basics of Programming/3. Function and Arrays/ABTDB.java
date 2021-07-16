import java.util.*;

public class ABTDB {
    public static Scanner sc = new Scanner(System.in);

    public static int anyBaseToDec(int n, int b) {
        int ans = 0;
        int mult = 1;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            ans += rem * mult;
            mult *= b;

        }
        return ans;

    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = anyBaseToDec(n, b);
        System.out.println(ans);
    }

}
