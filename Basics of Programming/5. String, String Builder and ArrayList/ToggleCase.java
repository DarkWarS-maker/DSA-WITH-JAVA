import java.util.*;

public class ToggleCase {

    public static String toggleCase(String str) {

        String ans = "";
        int i = 0;
        while (i < str.length()) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans += Character.toUpperCase(ch);

            } else {
                ans += Character.toLowerCase(ch);
            }
            i++;

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}
