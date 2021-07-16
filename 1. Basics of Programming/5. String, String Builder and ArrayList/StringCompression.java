import java.util.*;

public class StringCompression {

    public static String compression1(String str) {
        String ans = "";

        ans += str.charAt(0);

        int n = str.length();
        int i = 1;
        while (i < n) {
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                i++;
            }
            if (i < n) {
                ans += str.charAt(i);
                // System.out.println(ans);

            }
            i++;

        }

        return ans;

    }

    public static String compression2(String str) {

        String ans = "";
        int n = str.length();

        ans += str.charAt(0);
        int i = 1;
        int len = 1;
        while (i < n) {

            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                i++;
                len++;
            }
            if (len > 1) {
                ans += len;
                len = 1;
            }
            if (i < n) {
                ans += str.charAt(i);
            }
            i++;

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}
