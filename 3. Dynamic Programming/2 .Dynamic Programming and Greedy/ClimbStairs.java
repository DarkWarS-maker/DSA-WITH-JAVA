import java.util.*;
import java.util.Scanner;

public class ClimbStairs {

    public static Scanner sc = new Scanner(System.in);

    public static int findPath(int n, int qb[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        int ans=0;

        ans += findPath(n - 1, qb);
        ans += findPath(n - 2, qb);
        ans += findPath(n - 3, qb);

        return ans;

    }

    public static void main(String[] args) {
        int n = sc.nextInt();

        int ans = findPath(n, new int[n + 1]);
        System.out.println(ans);
    }

}
