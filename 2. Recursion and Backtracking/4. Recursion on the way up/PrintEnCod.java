import java.util.*;

public class PrintEnCod {

    public static Scanner sc = new Scanner(System.in);

    public static void printEnCod(String str, String asf) {

        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch1 = str.charAt(0);
        if (ch1 == '0') {
            return;
        }
       
        char ch1A = (char) (ch1 + 'a' - '1');
        printEnCod(str.substring(1), asf + ch1A);
        if (str.length() > 1) {
            String ch2 = str.substring(0, 2);
            int ch2N = Integer.parseInt(ch2);
            if (ch2N >= 10 && ch2N <= 26) {
                char ch2A = (char) ('a' + ch2N - 1);
                printEnCod(str.substring(2), asf + ch2A);
            }
        }

    }

    public static void decodeWays(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if (ch == '0')
            return;

        decodeWays(str.substring(1), ans + (char) ('a' + ch - '1'));
        if (str.length() > 1) {
            int num = (ch - '0') * 10 + (str.charAt(1) - '0');
            if (num <= 26)
                decodeWays(str.substring(2), ans + (char) ('a' + num - 1));
        }

    }

    public static void main(String[] args) {
        String ans = sc.nextLine();
        // decodeWays(ans, "");
        printEnCod(ans, "");

    }

}
