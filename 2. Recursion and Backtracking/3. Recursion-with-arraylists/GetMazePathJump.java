import java.util.*;

public class GetMazePathJump {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc==dc){
            ArrayList<String> bs=new ArrayList<>();
            bs.add(" ");
            return bs;
        }

        ArrayList<String> ans = new ArrayList<>();

        // Horizontal

        for (int c = 1; sc + c <= dc; c++) {
            ArrayList<String> nc = getMazePath(sr, sc + c, dr, dc);
            for (String cd : nc) {
                ans.add("H" + c + cd);
            }
        }

        // vertical

        for (int v = 1; sr + v <= dr; v++) {
            ArrayList<String> nr = getMazePath(sr + v, sc, dr, dc);
            for (String rd : nr) {
                ans.add("V" + v + rd);
            }
        }

        // Diagonal

        for (int d = 1; sr + d <= dr; d++) {
            ArrayList<String> nd = getMazePath(sr + d, sc + d, dr, dc);
            for (String rd : nd) {
                ans.add("D" + d + rd);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int dr = sc.nextInt();
        int dc = sc.nextInt();

        ArrayList<String> ans = getMazePath(1, 1, dr, dc);
        System.out.println(ans);
    }

}
