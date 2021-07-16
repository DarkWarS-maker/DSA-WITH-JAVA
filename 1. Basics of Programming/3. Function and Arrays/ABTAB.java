import java.util.*;

public class ABTAB {
    public static Scanner sc = new Scanner(System.in);

    public static int anyBaseToDec(int n1, int b1) {
        int ans = 0;
        int mult = 1;
        while (n1 != 0) {
            int rem = n1 % 10;
            n1 /= 10;
            ans += rem * mult;
            mult *= b1;

        }
        return ans;
    }

    public static int decToAnyBas(int ans1, int b2) {
        int ans = 0;
        int multi = 1;
        while (ans1 != 0) {
            int rem = ans1 % b2;
            ans1 /= b2;
            ans += rem * multi;
            multi *= 10;
        }
        return ans;
    }

    public static void main(String args[]) {
        int n1 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int ans1 = anyBaseToDec(n1, b1);
        int finalAns = decToAnyBas(ans1, b2);
        System.out.println(finalAns);
    }

}
