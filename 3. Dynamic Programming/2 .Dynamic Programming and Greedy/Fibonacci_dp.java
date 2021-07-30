import java.util.*;

public class Fibonacci_dp {

    public static Scanner sc = new Scanner(System.in);

    public static int fibUsingDp(int n, int qb[]) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        int fb1 = fibUsingDp(n - 1, qb);
        int fb2 = fibUsingDp(n - 2, qb);

        int ans = fb1 + fb2;
        qb[n] = ans;

        return ans;
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int qb[] = new int[n + 1];
        int ans = fibUsingDp(n, qb);
        System.out.println(ans);
    }

}
