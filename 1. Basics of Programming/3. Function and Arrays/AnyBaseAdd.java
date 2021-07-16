import java.util.*;

public class AnyBaseAdd {

    public static Scanner sc = new Scanner(System.in);

    public static int addInAnyBase(int b, int n1, int n2) {
        int ans = 0;
        int carry = 0;
        int multi = 1;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int sum = n1 % 10 + n2 % 10 + carry;
            n1 /= 10;
            n2 /= 10;
            int digit = sum % b;
            carry = sum / b;
            ans += digit * multi;
            multi *= 10;

        }
        return ans;
    }

    public static void main(String args[]) {
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = addInAnyBase(b, n1, n2);
        System.out.println(ans);
    }

}
