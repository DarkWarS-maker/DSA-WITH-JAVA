import java.util.*;

public class AllPalinDromicString {

    public static Scanner sc = new Scanner(System.in);

    public static String giveSubString(String str, int i, int j) {
        return str.substring(i, j + 1);

    }

    public static boolean checkPalindrome(String ans) {

        int strLength = ans.length() - 1;
        int st = 0;
        while (st < strLength) {
            if (ans.charAt(st) != ans.charAt(strLength)) {
                return false;
            }
            st++;
            strLength--;
        }
        return true;

    }

    public static void printAllPalindromicSubString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String ans = giveSubString(str, i, j);
                boolean chek = checkPalindrome(ans);
                if (chek == true) {
                    System.out.println(ans);
                }

            }
        }
    }

    public static void main(String args[]) {
        String str = sc.nextLine();
        printAllPalindromicSubString(str);

    }

}
