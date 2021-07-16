import java.util.*;

public class Rotate90 {

    public static Scanner sc = new Scanner(System.in);

    public static void transpose(int arr[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

    }

    public static void getDerireAns(int arr[][], int n) {
        int cmin = 0;
        int cmax = n - 1;
        while (cmin < cmax) {
            for (int r = 0; r < n; r++) {
                int temp = arr[r][cmin];
                arr[r][cmin] = arr[r][cmax];
                arr[r][cmax] = temp;

            }
            cmin++;
            cmax--;
        }
    }

    public static void main(String args[]) {

        int n = sc.nextInt();
        // int m = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr, n);
        getDerireAns(arr, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
