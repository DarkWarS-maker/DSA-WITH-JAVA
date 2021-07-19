import java.util.*;

public class PrintStairPaths {

    public static Scanner sc = new Scanner(System.in);

    public static void printPath(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
        }

        for (int i = 1; n - i >= 0 && i <= 3; i++) {
            printPath(n - i, ans + i);

        }

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        printPath(n, "");
    }

}
