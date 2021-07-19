
import java.util.*;

public class GetMazePath {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> findPath(int r, int c, int dr, int dc) {

        if (r == dr && c == dc) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        if (r > dr || c > dc) {
            ArrayList<String> bs = new ArrayList<>();
            return bs;

        }

        ArrayList<String> reH = findPath(r, c + 1, dr, dc);
        ArrayList<String> reV = findPath(r + 1, c, dr, dc);

        ArrayList<String> myAns = new ArrayList<>();

        for (String s : reH) {
            myAns.add("H" + s);

        }
        for (String v : reV) {
            myAns.add("V" + v);
        }
        return myAns;

    }

    public static void main(String[] args) {
        int dr = sc.nextInt();
        int dc = sc.nextInt();

        ArrayList<String> ans = findPath(1, 1, dr, dc);
        System.out.println(ans);
    }

}