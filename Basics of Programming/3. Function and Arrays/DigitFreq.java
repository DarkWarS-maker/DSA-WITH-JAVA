import java.util.*;

public class DigitFreq {

    public static Scanner sc = new Scanner(System.in);

    public static int findFreq(int n, int d) {
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == d) {
                ans++;
            }

        }
        return ans;
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = findFreq(n, d);994543234
        System.out.println(ans);

    }

}
