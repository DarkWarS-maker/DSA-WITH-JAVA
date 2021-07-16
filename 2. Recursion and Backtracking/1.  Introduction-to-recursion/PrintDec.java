
import java.util.Scanner;

public class PrintDec {

    public static Scanner sc = new Scanner(System.in);

    public static void printDecr(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecr(n - 1);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        printDecr(n);

    }

}
