import java.util.*;

public class ExitPoint {

    public static Scanner sc = new Scanner(System.in);

    public static void findExitPoint(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int r = 0;
        int c = 0;
        int dir = 0;
        while (r >= 0 && r < arr.length && c >= 0 && c < arr[0].length) {
            dir = (arr[r][c] + dir) % 4;
            if (dir == 0) {
                // east
                c++;
                if (c == m) {
                    c--;
                    break;
                }
            } else if (dir == 1) {
                // south
                r++;
                if (r == n) {
                    r--;
                    break;
                }
            } else if (dir == 2) {
                // west
                c--;
                if (c == -1) {
                    c++;
                    break;
                }
            } else {
                // north
                r--;
                if (r == -1) {

                    r++;
                    break;
                }
            }
        }
        System.out.println(r);
        System.out.println(c);
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        findExitPoint(arr);

    }

}
