
import java.util.*;

public class PrintMazePath {

    public static Scanner sc = new Scanner(System.in);

    public static void printMazePath(int sr, int sc, int dr, int dc, String ans) {

        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }

        // Horizontal

        if (sc + 1 <= dc) {
            printMazePath(sr, sc + 1, dr, dc, ans + "H");

        }
        // Vertical
        if (sr + 1 <= dr) {
            printMazePath(sr + 1, sc, dr, dc, ans + "V");
        }
    }

    public static void main(String[] args) {
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        printMazePath(1, 1, dr, dc, "");
    }

}