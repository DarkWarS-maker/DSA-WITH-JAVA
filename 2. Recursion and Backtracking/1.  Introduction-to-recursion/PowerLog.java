import java.util.*;

public class PowerLog {

    public static Scanner sc = new Scanner(System.in);

    public static int findPow(int n, int x) {

        if (x == 0) {
            return 1;
        }

        int recAns = findPow(n, x / 2);
        if (x % 2 == 1) {
            return n * recAns * recAns;
        } else {
            return recAns * recAns;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int ans = findPow(n, x);
        System.out.println(ans);
    }

}