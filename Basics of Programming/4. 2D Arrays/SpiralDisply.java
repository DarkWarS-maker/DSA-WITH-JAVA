import java.util.*;

public class SpiralDisply {

    public static Scanner sc = new Scanner(System.in);

    public static void printSpiralPath(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m - 1;
        int tnel = n * m;

        while (tnel > 0) {
            for (int r = rmin; r <= rmax && tnel > 0; r++) {
                System.out.println(arr[r][cmin]);
                tnel--;
            }
            cmin++;

            for (int c = cmin; c <= cmax && tnel > 0; c++) {
                System.out.println(arr[rmax][c]);
                tnel--;
            }
            rmax--;

            for (int r = rmax; r >= rmin && tnel > 0; r--) {
                System.out.println(arr[r][cmax]);
                tnel--;
            }
            cmax--;

            for (int c = cmax; c >= cmin && tnel > 0; c--) {
                System.out.println(arr[rmin][c]);
                tnel--;
            }
            rmin++;
        }
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
        printSpiralPath(arr);
    }

}
