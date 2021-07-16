import java.util.*;

public class PrintPermuWithIter {

    public static Scanner sc = new Scanner(System.in);

    public static int fact(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n;
            n--;
        }
        return ans;
    }

    public static void printPermu(String str1) {

        int n1 = str1.length();
        int fc = fact(n1);

        for (int i = 0; i < fc; i++) {

            int n = str1.length();
            StringBuilder ans = new StringBuilder("");
            StringBuilder str = new StringBuilder(str1);
            int temp = i;
            while (n > 0) {

                int rem = temp % n;
                temp /= n;
                // System.out.println(rem);
                ans.append(str.charAt(rem));
                str.deleteCharAt(rem);

                n--;
            }
            System.out.println(ans);

        }
    }

    public static void main(String args[]) {

        String ans = sc.nextLine();

        printPermu(ans);

    }

}
