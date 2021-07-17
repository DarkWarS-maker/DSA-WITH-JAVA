import java.util.*;

public class DisplayRev {

    public static Scanner sc = new Scanner(System.in);

    public static void DisplayRev(int arr[], int i) {

        if (i == arr.length) {
            return;
        }

        DisplayRev(arr, i + 1);
        System.out.println(arr[i]);
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DisplayRev(arr, 0);

    }

}
