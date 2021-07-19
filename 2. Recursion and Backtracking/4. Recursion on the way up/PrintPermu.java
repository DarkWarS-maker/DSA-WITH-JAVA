import java.util.*;

public class PrintPermu {

    public static Scanner sc = new Scanner(System.in);

    public static void printPermuTan(String str, String afs) {
        if (str.length() == 0) {
            System.out.println(afs);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1, str.length());
            printPermuTan(ros, afs + ch);
        }

    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        printPermuTan(str, "");

    }

}
